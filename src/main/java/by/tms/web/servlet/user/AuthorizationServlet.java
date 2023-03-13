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
import java.util.Optional;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String CURRENT_USER = "currentUser";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/authorization/authorization.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter(USERNAME);
        String password = req.getParameter(PASSWORD);

        if (UserValidator.isValidUsername(username) && UserValidator.isValidPassword(password)) {
            Optional<User> byUsername = UserService.getInstance().findByUsername(username);
            if (byUsername.isPresent()) {
                User user = byUsername.get();
                if (user.getPassword().equals(password)) {
                    req.getSession().setAttribute(CURRENT_USER, user);

                    req.setAttribute("name", user.getName());
                    getServletContext().getRequestDispatcher("/").forward(req, resp);
                } else {
                    getServletContext().getRequestDispatcher("/authorization/invalidPassword.jsp").forward(req,resp);
                }
            } else {
                getServletContext().getRequestDispatcher("/authorization/userNotFound.jsp").forward(req,resp);
            }
        } else {
            getServletContext().getRequestDispatcher("/authorization/invalidInfoAuth.jsp").forward(req,resp);
        }
    }
}
