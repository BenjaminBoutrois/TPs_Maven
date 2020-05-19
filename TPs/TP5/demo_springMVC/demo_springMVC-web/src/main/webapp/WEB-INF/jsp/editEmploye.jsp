<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

	<sf:form method="POST" modelAttribute="employe">
		<fieldset>
			<table>
				<tr>
					<td>Nom :</td>
					<td><sf:input path="nom" /></td>
				</tr>
				<tr>
					<td>Prénom :</td>
					<td><sf:input path="prenom" /></td>
				</tr>
								<tr>
					<td>Login :</td>
					<td><sf:input path="login" /><br/>
						<sf:errors path="login"/>
					</td>
				</tr>
								<tr>
					<td>Password :</td>
					<td><sf:input path="password" /></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><sf:input path="email" /><br/>
						<sf:errors path="email"/></td>
				</tr>
				<tr>
					<td>Role :</td>
					<td><sf:input path="role" /></td>
				</tr>				
				<tr>
					<td colspan="2"><input type="submit"
						value="Ok, je crée un employé Objis !" /></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>
<a href="http://www.objis.com"><img src="resources/logo_objis.png"
	border=0></a>

