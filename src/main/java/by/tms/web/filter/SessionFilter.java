package by.tms.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = {"NameChange", "PasswordChange"})
public class SessionFilter extends HttpFilter {
    private static final String CURRENT_USER = "currentUser";

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute(CURRENT_USER) == null) {
            res.setStatus(403);
            getServletContext().getRequestDispatcher("/index.jsp").forward(req, res);
        } else {
            chain.doFilter(req, res);
        }
    }
}
