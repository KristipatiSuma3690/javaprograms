<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookapp.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Title: ${book.title }
Price: ${book.price }
Author: ${book.author }
Category: ${book.category }
BookId: ${book.bookId }<br>
${message }


<%-- <% Book book=(Book)request.getAttribute("book");%>
//Title:<%=book.getTitle() %><br>
//Price:<%=book.getPrice() %><br>
//Author:<%=book.getAuthor() %><br>
Category:<%=book.getCategory() %><br>
BookId:<%=book.getBookId() %><br>
 --%>


</body>
</html>