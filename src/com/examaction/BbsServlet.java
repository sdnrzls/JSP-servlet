package com.examaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BbsServlet extends HttpServlet { //httpservlet을 상속
 @Override  //post 방식이므로 dopost 메소드 상속
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 req.setCharacterEncoding("utf-8"); //req = request 
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		resp.setContentType("text/html;charset=utf-8");//resp=response ,html로 연결
		PrintWriter out = resp.getWriter(); //html 틀 작성
		out.println("<html>");
		out.println("<head><title>결과</title></head>");
		out.println("<body>");
		out.println("이름: "+name +"<br>");
		out.println("제목: "+title+"<br>");
		out.println("내용: "+content+"<br>");
		out.println("</body>");
		out.println("</html>");
}
	
}
