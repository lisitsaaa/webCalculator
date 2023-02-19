package by.tms.web.servlet.calculator;

import by.tms.entity.Operation;
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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> allByUser = OperationService.getInstance().findAll();
        if (allByUser.isEmpty()) {
            resp.getWriter().println(STORAGE_IS_EMPTY);
        } else {
            allByUser.forEach(resp.getWriter()::println);
        }
    }
}