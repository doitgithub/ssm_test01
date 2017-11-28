<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

userName1 = ${user.userName}

<br/>userName2 = <%=((User)request.getAttribute("user")).getUserName() %>

<br/>
userName3 = <%=request.getParameter("userName") %>

<br/>
userName4 = ${param.userName }
<br/>
userName5 = ${requestScope.user.userName }


</body>
</html>