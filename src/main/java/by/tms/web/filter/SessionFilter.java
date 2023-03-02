package by.tms.web.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.web.util.WebMessage.*;

@WebFilter(servletNames = {"MainMenu", "NameChange", "PasswordChange"})
public class SessionFilter extends HttpFilter {
    private static final String CURRENT_USER = "currentUser";
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getSession().getAttribute(CURRENT_USER) == null) {
            res.setStatus(403);
            res.getWriter().println(REGISTRATION_EXAMPLE);
            res.getWriter().println(AUTHORIZATION_EXAMPLE);
        } else {
            chain.doFilter(req, res);
        }
    }
}
