package org.ecommerce.entities;

public class Produit implements Entite {
	private static Long lastId=1l; 
	private Long idProduit;
	private Double prix;
	private String nom;
	private String description;
	private Boolean isEnStock;

	public Produit(Double prix, String nom, String description, Boolean isEnStock) {
		super();
		this.idProduit=lastId++;
		this.prix = prix;
		this.nom = nom;
		this.description = description;
		this.isEnStock = isEnStock;
	}
	
	public Long getId() {
		return idProduit;
	}


	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsEnStock() {
		return isEnStock;
	}
	public void setIsEnStock(Boolean isEnStock) {
		this.isEnStock = isEnStock;
	}
	@Override
	public String toString() {
		return "Produit [prix=" + prix + ", nom=" + nom + ", description=" + description + ", isEnStock=" + isEnStock
				+ "]";
	}
	
	
	
/*public static void main (String args[]){
	System.out.println(new Produit(11d, "cc", "ff", true).getId());
	System.out.println(new Produit(12d, "cc", "ff", true).getId());
	}*/
}
