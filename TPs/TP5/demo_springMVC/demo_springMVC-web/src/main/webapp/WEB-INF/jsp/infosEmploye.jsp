<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Détails employe </title>
</head>
<body>
<h2>Détails employé '<c:out value="${employe.login}" />' :</h2>
<ul>
		<li>
		Nom : <c:out value="${employe.nom}" />
		<li>
		Prenom : <c:out value="${employe.prenom}" />
		<li>
		Email : <c:out value="${employe.email}" />
		</li>
</ul>

<a href="http://www.objis.com"><img src="resources/logo_objis.png" border=0></a>

</html>	