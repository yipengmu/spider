package com.mu.spider.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class EncodeFilter
 */
public class EncodeFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public EncodeFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 这里会过滤所有的编码，这里就可以设置生效
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String reqEncode = request.getCharacterEncoding();
		String respEncode = response.getCharacterEncoding();
		// 传递控制到下一个过滤器
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
