<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>produit</title>
</head>
<body>
	
	
	<form:form action="/ecommerce/" method="post">
		<li><c:out value="${produit.nom}"/></li>
		<li><c:out value="${produit.prix}"/></li>
		<li><c:out value="${produit.description}"/></li>
		<input  type="hidden" name="idProduit" value="${produit.idProduit}"/>
		<label> entré la contité que vous voules ajouter a votre panier</label>
		<input  type="text" name="quantite"/>
		<input type="submit" value="ajouter au panier">
	</form:form>

</body>
</html>