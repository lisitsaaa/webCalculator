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

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private static final String NAME = "name";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/registration/registration.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter(NAME);
        String username = req.getParameter(USERNAME);
        String password = req.getParameter(PASSWORD);

        if (UserValidator.isValidUsername(username)
                && UserValidator.isValidPassword(password)) {
            Optional<User> user = UserService.getInstance().findByUsername(username);
            if(user.isEmpty()){
                UserService.getInstance().create(new User(username,password,name));
                req.setAttribute("name", name);
                getServletContext().getRequestDispatcher("/registration/successReg.jsp").forward(req, resp);
            } else {
                getServletContext().getRequestDispatcher("/registration/existingName.jsp").forward(req,resp);
            }
        } else {
            getServletContext().getRequestDispatcher("/registration/invalidInfoReg.jsp").forward(req,resp);
        }
    }
}
