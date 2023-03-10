package by.tms.web.servlet.user;

import by.tms.entity.User;
import by.tms.service.UserService;
import by.tms.validator.UserValidator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PasswordChange", value = "/passwordChange")
public class PasswordChangeServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    private static final String PASSWORD = "password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/passwordChange/passwordChange.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        String password = req.getParameter(PASSWORD);

        if (UserValidator.isValidPassword(password)) {
            UserService.getInstance().changePasswordByUSerName(currentUser.getUsername(), password);
            currentUser.setPassword(password);
            req.setAttribute("password", currentUser.getPassword());
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/passwordChange/invalidPassword.jsp").forward(req, resp);
        }
    }
}

