package com.xlf.school.experiment7.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter({"/EncodingFilter", "/*"})
public class EncodingFilter implements Filter {
    public EncodingFilter() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
        response.setCharacterEncoding("utf-8");
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
    }
}
