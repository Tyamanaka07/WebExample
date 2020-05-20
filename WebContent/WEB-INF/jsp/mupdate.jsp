<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>データ操作</title>
</head>
<body>
<h1>変更</h1>

<form action="mupdate" method = "post">
<input type = "hidden" name = "mid" value = "${member.mid}">
名前 : <input type = "text" name = "name" value = "${member.name}" required placeholder = "名前"><br>
住所 : <input type = "text" name = "adr" value = "${member.adr}"required placeholder = "住所"><br>
<input type = "submit" value = "送信">

</form>


<h1>削除</h1>
<form action="mdel" method = "post">
<input type = "hidden" name = "mid" value = "${member.mid}">
<input type = "hidden" name = "name" value = "${member.name}" >
<input type = "hidden" name = "adr" value = "${member.adr}">
<input type = "submit" value = "削除">
</form>

</body>
</html>