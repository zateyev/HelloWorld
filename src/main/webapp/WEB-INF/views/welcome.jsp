<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
    <link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />
    <script src="http://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
    <script src='<c:url value="/resources/js/app.js" />' type="text/javascript"></script>
</head>
<body>
<div id="msg">${message}</div>
<p>Изменить слово:</p>
<form id="set-greeting">
    <input type="text" maxlength="255">
    <input type="submit" value="Отправить">
</form>
</body>
</html>
