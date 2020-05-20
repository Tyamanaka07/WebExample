<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メンバーリスト</title>
</head>
<body>

<h1>メンバーリスト</h1>

<form action="mlist" method = "post">
追加は下のフォームから<br>
<input type = "text" name = "name" required placeholder = "名前"><br>
<input type = "text" name = "adr" required placeholder = "住所"><br>
<input type = "submit" value = "追加"><br>
</form>

<table>
<tr><th>メンバーID</th><th>名前</th><th>住所</th>
<c:forEach var = "member" items = "${list}">
	<tr>
		<td>${member.mid}</td>
		<td>${member.name}</td>
		<td>${member.adr}</td>
	</tr>
</c:forEach>
</table>


</body>
</html>