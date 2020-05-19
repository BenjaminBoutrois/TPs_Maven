<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

	<sf:form method="POST" modelAttribute="formation">
		<fieldset>
			<table>
				<tr>
					<td>Thème :</td>
					<td><sf:input path="theme" /></td>
				</tr>
				<tr>
					<td>Date :</td>
					<td><sf:input path="date" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						value="Ok, je crée une formation Objis !" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
<a href="http://www.objis.com"><img src="resources/logo_objis.png"
	border=0></a>

