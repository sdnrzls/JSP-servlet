<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> <!-- sql연결 -->
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
%>
<sql:setDataSource dataSource="jdbc/member" var="datasource" scope="application"/> 

	<sql:update dataSource="${datasource }">
		insert into jstlmember values(?,?,?)
		<sql:param value="<%=id %>"/>
		<sql:param value="<%=passwd %>"/>
		<sql:param value="<%=name %>"/>
	</sql:update>
	<c:import url="sqlList.jsp" />
</body>
</html>