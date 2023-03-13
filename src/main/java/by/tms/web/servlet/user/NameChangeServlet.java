package by.tms.web.servlet.user;

import by.tms.entity.User;
import by.tms.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NameChange",value = "/nameChange")
public class NameChangeServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    private static final String NAME = "name";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/nameChange/nameChange.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        String name = req.getParameter(NAME);
        UserService.getInstance().changeNameByUserName(currentUser.getUsername(), name);
        currentUser.setName(name);
        req.setAttribute("name", currentUser.getName());
        getServletContext().getRequestDispatcher("/").forward(req, resp);
    }
}