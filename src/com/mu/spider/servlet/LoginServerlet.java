package com.mu.spider.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.TextUI;

/**
 * Servlet implementation class LoginServerlet
 */
public class LoginServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServerlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = request.getParameter("uid");
		String upsw = request.getParameter("upsw");

		if (isEmpty(uid) | isEmpty(upsw) | !checkLogin(uid, upsw)) {
			response.sendRedirect("LoginErrorServerlet");
			return;
		}

		HttpSession seesion = request.getSession(true);
		seesion.setAttribute("uid", uid);
		// 登录成功
		response.sendRedirect("MainServlet");
		return;
	}

	private boolean checkLogin(String uid, String upsw) {
		// TODO Auto-generated method stub
		if (uid.length() > 0 && upsw.length() > 0) {
			return true;
		}
		return false;
	}

	private boolean isEmpty(String s) {
		if (s == null || "".equals(s)) {
			return true;
		}
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
