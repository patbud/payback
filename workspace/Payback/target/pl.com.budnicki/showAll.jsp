<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="payback.pl.com.budnicki.Users"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payback Recruitment Task</title>
</head>
<body>
All Users: <br> 
        <c:forEach var="usr" items="${usersList}">
            ID: ${usr.idUsers} <br>
            Name: ${usr.name} <br>
            Surname: ${usr.surname}<br>
            City: ${usr.city}<br>
            -------------------------------------<br>
        </c:forEach>
    </body>
</html>