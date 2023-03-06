package by.tms.web.servlet.calculator;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static by.tms.web.util.WebMessage.STORAGE_IS_EMPTY;

@WebServlet("/showingAll")
public class ShowingAllInfoServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        List<Operation> allByUser = OperationService.getInstance().findAll(currentUser);
        if (allByUser.isEmpty()) {
            resp.getWriter().println(STORAGE_IS_EMPTY);
        } else {
            allByUser.forEach(resp.getWriter()::println);
            req.setAttribute("operations", allByUser);
            getServletContext().getRequestDispatcher("/personalAccount/history/printAllHistory.jsp").forward(req, resp);
        }
    }
}