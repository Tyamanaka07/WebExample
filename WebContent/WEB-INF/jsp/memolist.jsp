<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タイトルリスト</title>
</head>
<body>
<h1>Memo</h1>
<form action = "memo" method = "get">
<ul>
<c:forEach var = "memolist" items = "${list}">
	<li><a href = "memo?mid=${memolist.mid}">${memolist.title}</a></li>
</c:forEach>
</ul>
<input type = "hidden" name = "mid">
</form>
</body>
</html>