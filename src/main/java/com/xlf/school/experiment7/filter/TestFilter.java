package com.xlf.school.experiment7.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({ "/TestServlet" })
public class TestFilter implements Filter {

    public TestFilter() {
    	System.out.println("过滤器构造函数运行");
    }

	@Override
	public void destroy() {
		System.out.println("过滤器消亡函数运行");
	}

	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		System.out.println("对请求进行了过滤处理");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("执行chain.doFilter方法后面的代码");
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("过滤器初始化函数运行");
	}

}
