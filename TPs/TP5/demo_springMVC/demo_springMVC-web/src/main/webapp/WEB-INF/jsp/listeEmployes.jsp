<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Equipe société Objis </title>
</head>
<body>
<h2>Ils vont vous faire aimer Spring MVC :</h2>
<ul>
	<c:forEach items="${employes}" var="employe">
		<li>
		<c:out value="${employe.nom}" />
		<c:out value="${employe.prenom}" />
		<c:out value="${employe.email}" />
		</li>
	</c:forEach>
</ul>

<a href="http://www.objis.com"><img src="resources/logo_objis.png" border=0></a>

</html>	