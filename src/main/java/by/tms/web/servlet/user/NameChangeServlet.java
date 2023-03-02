package by.tms.web.servlet.user;

import by.tms.entity.User;
import by.tms.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.web.util.WebMessage.MAIN_MENU;
import static by.tms.web.util.WebMessage.NEW_NAME_MESSAGE;

@WebServlet(name = "NameChange",value = "/nameChange")
public class NameChangeServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    private static final String NAME = "name";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        String name = req.getParameter(NAME);
        UserService.getInstance().changeNameByUSerName(currentUser.getUsername(), name);
        currentUser.setName(name);
        resp.getWriter().println(String.format(NEW_NAME_MESSAGE, currentUser.getName()));
        resp.getWriter().println(String.format(MAIN_MENU, currentUser.getName()));

    }
}