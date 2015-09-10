package org.ecommerce.entities;

public class LigneDeCommande {
	private static Long lastId=1l; 
	private Long idLC ;
	private Produit produit;
	private Integer quantite;

	public LigneDeCommande(Produit produit, Integer quantite) {
		super();
		this.idLC=lastId++;
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public LigneDeCommande() {
		super();
		this.idLC=lastId++;
	
	}
	public Long getIdLC() {
		return idLC;
	}

	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	
	public Double getPrix(){
		return this.produit.getPrix()*this.quantite;
	
	}
	@Override
	public String toString() {
		return "LigneDeCommande [produit=" + produit + ", quantite=" + quantite + "]";
	}

	
	
	
	

}
