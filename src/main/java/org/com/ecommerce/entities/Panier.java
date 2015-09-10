package org.com.ecommerce.entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Panier {
	private static Long lastId=1l; 
	private Long idPanier;
	private Map<Long,LigneDeCommande> achat;
	
	public Panier(){
		idPanier=lastId++;
		this.achat=new HashMap<Long, LigneDeCommande>();
	}
	
	public Long getIdPanier() {
		return idPanier;
	}

	public Map<Long, LigneDeCommande> getAchat() {
		return achat;
	}

	public void addLigneCommande(Produit produit,Integer quantite){
		
		if(achat.containsKey(produit.getIdProduit())){
			LigneDeCommande lc=achat.get(produit.getIdProduit());
			lc.setQuantite(lc.getQuantite()+quantite);
			return;
		}
		
		achat.put(produit.getIdProduit(), new LigneDeCommande(produit, quantite));
	}
	
	public Double getTotal(){
		Double prixTotal=0d;
		
		Iterator<LigneDeCommande> lcIter=this.achat.values().iterator();
		
		while(lcIter.hasNext()){
			prixTotal+=lcIter.next().getPrix();
		}
		
		return prixTotal;
	}
	
	
	




	@Override
	public String toString() {
		return "Panier [achat=" + achat + "]";
	}




}
