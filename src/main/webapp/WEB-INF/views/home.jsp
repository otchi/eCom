<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Panier</title>
</head>
<body>
<h1> bien venue dans notre boutique en ligne</h1>
<div>
votre panier :
<c:forEach items="${panier.achat}" var="ligneCommande">
	<c:out value="${ligneCommande}"></c:out>
</c:forEach>
<c:out value="${panier.total}"></c:out>

</div>
<br>
<br>

<h4>nos produit</h4>
	 <table>
		 <tr>
			<c:forEach items="${produits}" var="produit">
				
				<td>
				
					<ul>
						<li><c:out value="${produit.nom}"/></li>
						<li><c:out value="${produit.prix}"/></li>
						<li><c:out value="${produit.description}"/></li>
					</ul>
				<a href="http://localhost:8080/ecommerce/addToPanier/${produit.idProduit}">	
					<button>ajouter</button> </a>
				</td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>
