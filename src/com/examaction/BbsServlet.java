package com.examaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BbsServlet extends HttpServlet { //httpservlet�� ���
 @Override  //post ����̹Ƿ� dopost �޼ҵ� ���
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 req.setCharacterEncoding("utf-8"); //req = request 
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		resp.setContentType("text/html;charset=utf-8");//resp=response ,html�� ����
		PrintWriter out = resp.getWriter(); //html Ʋ �ۼ�
		out.println("<html>");
		out.println("<head><title>���</title></head>");
		out.println("<body>");
		out.println("�̸�: "+name +"<br>");
		out.println("����: "+title+"<br>");
		out.println("����: "+content+"<br>");
		out.println("</body>");
		out.println("</html>");
}
	
}
