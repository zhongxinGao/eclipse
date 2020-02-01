package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//设置响应的编码格式
		response.setContentType("text/html; charaset = GBK");
		//response.setCharacterEncoding("GBK");
		//获得请求方式
		String method = request.getMethod();
		//获得请求资源相关的内容
		String requestURI = request.getRequestURI();
		StringBuffer requestURL = request.getRequestURL();
		String webName = request.getContextPath();
		String querryString = request.getQueryString();
		 response.getWriter().write("<h1>下面是获得的字符串</h1>");
	        response.getWriter().write("<h1>method(HTTP方法):<h1>");
	        response.getWriter().write("<h1>"+method+"</h1><br>");
	        response.getWriter().write("<h1>requestURi(请求URI）:</h1>");
	        response.getWriter().write("<h1>" + requestURI + "</h1><br>");
	        response.getWriter().write("<h1>webname(应用名称):</h1>");
	        response.getWriter().write("<h1>" + webName + "</h1><br>");
	        response.getWriter().write("<h1>querrystring(查询字符串):</h1>");
	        response.getWriter().write("<h1>" + querryString + "</h1>");
	
				}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
