package by.tms.web.servlet.calculator;

import by.tms.entity.User;
import by.tms.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.web.util.WebMessage.OPERATIONS_WERE_REMOVED;

@WebServlet("/removingAll")
public class RemovingAllInfoServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        OperationService.getInstance().removeAll(currentUser);
        getServletContext().getRequestDispatcher("/personalAccount/history/removing/removingHistory.jsp").forward(req,resp);
    }
}