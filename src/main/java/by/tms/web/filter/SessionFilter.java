package by.tms.web.filter;

import by.tms.web.util.WebMessage;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.web.util.WebMessage.ERROR_MESSAGE;


@WebFilter(servletNames = {"MainMenu"})
public class SessionFilter extends HttpFilter {
    private static final String CURRENT_USER = "currentUser";
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute(CURRENT_USER) == null) {
            res.setStatus(403);
            res.getWriter().println(ERROR_MESSAGE);
        } else {
            chain.doFilter(req, res);
        }
    }
}
