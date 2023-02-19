package by.tms.web.servlet.calculator;

import by.tms.entity.Operation;
import by.tms.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

import static by.tms.web.util.WebMessage.OPERATION_NOT_FOUND;

@WebServlet("/showingById")
public class ShowingInfoByIdServlet extends HttpServlet {
    private static final String ID = "id";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter(ID));
        Optional<Operation> operation = OperationService.getInstance().findById(id);

        if (operation.isPresent()) {
            resp.getWriter().println(operation.get());
        }else {
            resp.getWriter().println(OPERATION_NOT_FOUND);
        }
    }
}