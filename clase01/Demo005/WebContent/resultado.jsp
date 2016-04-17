<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1><%=request.getAttribute("opera") %></H1>
<H1><%=request.getAttribute("num1") %></H1>
<H1><%=request.getAttribute("num2") %></H1>
<H1><%=request.getAttribute("rpta") %></H1>

<a href="index.html">Retornar</a>
</body>
</html>