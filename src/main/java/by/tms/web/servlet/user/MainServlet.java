package by.tms.web.servlet.user;

import by.tms.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.web.util.WebMessage.*;

@WebServlet(name = "MainMenu",value = "/main")
public class MainServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        resp.getWriter().println(String.format(HELLO_MESSAGE, currentUser.getName()));
        resp.getWriter().println(CALCULATOR_AND_HISTORY_MENU);
    }
}
