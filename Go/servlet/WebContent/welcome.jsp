<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class = "com.bean.User"></jsp:useBean>
	欢迎你<jsp:getProperty property="name" name="user"/>
</body>
</html>