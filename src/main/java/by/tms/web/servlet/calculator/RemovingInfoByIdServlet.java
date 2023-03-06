package by.tms.web.servlet.calculator;

import by.tms.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/removingById")
public class RemovingInfoByIdServlet extends HttpServlet {
    private static final String ID = "id";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/personalAccount/history/removing/idChoice.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter(ID));
        OperationService.getInstance().removeById(id);
        getServletContext().getRequestDispatcher("/personalAccount/history/removing/removingHistory.jsp").forward(req,resp);
    }
}
