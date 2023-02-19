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

import static by.tms.web.util.WebMessage.*;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String CURRENT_USER = "currentUser";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter(USERNAME);
        String password = req.getParameter(PASSWORD);

        if (UserValidator.isValidUsername(username) && UserValidator.isValidPassword(password)) {
            Optional<User> byUsername = UserService.getInstance().findByUsername(username);
            if (byUsername.isPresent()) {
                User user = byUsername.get();
                if (user.getPassword().equals(password)) {
                    req.getSession().setAttribute(CURRENT_USER, user);
                    resp.getWriter().println(String.format(HELLO_MESSAGE, user.getName()));
                    resp.getWriter().println(CALCULATOR_AND_HISTORY_MENU);
                } else {
                    resp.getWriter().println(WRONG_PASSWORD);
                }
            } else {
                resp.getWriter().println(USER_NOT_FOUND);
            }
        } else {
            resp.getWriter().println(INVALID_INFO);
        }
    }

}
