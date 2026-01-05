
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>Результат</title>
</head>
<body>

<!-- Отображаем результат -->
<h1>${sessionScope.result}</h1>

<!-- Ссылка для начала заново -->
<a href="hello">Начать заново</a>

<hr>
<!-- Статистика сессии -->
<h3>Статистика сессии:</h3>
<p>ID сессии: ${pageContext.session.id}</p>
<p>Время создания: ${pageContext.session.creationTime}</p>
</body>
</html>
