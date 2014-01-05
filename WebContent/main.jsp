<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 尼玛 ，终于进来了 </h1><br>
<% 
String uid = (String)request.getAttribute("uid"); 
String tips =(String)request.getAttribute("tips");
%>
<% if(uid != null && !uid.isEmpty()){%>
${账户：uid}
<% }%>

<br>
<a href="/Spider/index.jsp">go home</a>

<br><br>
${tips}
</body>
<%-- <% 
	request.getSession().removeAttribute("uid");
	request.getSession().removeAttribute("tips");
%> --%>
</html>