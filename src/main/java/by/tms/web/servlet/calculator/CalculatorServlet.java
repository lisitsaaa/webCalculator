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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    private static final String CURRENT_USER = "currentUser";
    private static final String NUMBERS = "numbers";
    private static final String TYPE = "type";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/calculator/calculator.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute(CURRENT_USER);
        String numbers = req.getParameter(NUMBERS);
        String type = req.getParameter(TYPE);

        Optional<Operation> result = getResult(numbers, type, currentUser);
        if (result.isPresent()) {
            resp.getWriter().println(result.get());
        } else {
//            resp.getWriter().println(ERROR_MESSAGE);
        }
        req.setAttribute("numbers", numbers);
        req.setAttribute("type", type);
        req.setAttribute("result", result.get());
        getServletContext().getRequestDispatcher("/calculator/result.jsp").forward(req,resp);
    }

    private Optional<Operation> getResult(String numbers, String type, User currentUser) {
        Optional<Operation.Type> type1 = readOperationType(type.toUpperCase());

        if (type1.isPresent()) {
            Operation.Type operationType = type1.get();
            List<Double> numbersList = new ArrayList<>();
            String[] split = numbers.split(",");

            for (String number : split) {
                numbersList.add(Double.parseDouble(number));
            }
            Operation operation = new Operation(numbersList, operationType, currentUser);
            return OperationService.getInstance().calculate(operation);
        }
        return Optional.empty();
    }

    private Optional<Operation.Type> readOperationType(String type) {
        switch (type) {
            case "SUM": {
                return Optional.of(Operation.Type.SUM);
            }
            case "SUB": {
                return Optional.of(Operation.Type.SUB);
            }
            case "MUL": {
                return Optional.of(Operation.Type.MUL);
            }
            case "DIV": {
                return Optional.of(Operation.Type.DIV);
            }
        }
        return Optional.empty();
    }

}
