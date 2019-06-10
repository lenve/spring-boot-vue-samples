package org.sang;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by sang on 2018/7/11.
 */
@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        int i = 1 / 0;
        System.out.println("doFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
