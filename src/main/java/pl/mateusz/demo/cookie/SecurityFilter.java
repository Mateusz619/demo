package pl.mateusz.demo.cookie;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class SecurityFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String cart = servletRequest.getParameter("generate cart");
        if(cart != null)
            throw new RuntimeException("cart in cookie");
        if(cart.equals("none cart"))
            throw new RuntimeException("add product and create cart");

        servletResponse.setContentType("/html");
        filterChain.doFilter(servletRequest,servletResponse);
    }

}
