package org.com.ecommerce.controller;

import java.util.HashMap;
import java.util.Map;

import org.com.ecommerce.entities.Panier;
import org.com.ecommerce.entities.Produit;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller(value="/")
@Scope("session")
public class PanierController {
	Map<Long,Produit> produits;
	Panier panier;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap model){	
		intialise();
		model.put("panier", panier);
		model.put("produits",produits.values() );
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String putPanier(ModelMap model,
			@RequestParam("idProduit") Long idProduit,
			@RequestParam("quantite") Integer quantite){
		
		panier.addLigneCommande(produits.get(idProduit), quantite);
		model.put("panier", panier);
		model.put("produits",produits.values());
		return "home";
	}
		
	@RequestMapping(value="addToPanier/{idProduit}",method=RequestMethod.GET)
	public ModelAndView ajouterPanier(@PathVariable(value = "idProduit") Long idProduit,
								ModelMap model){		
	
		Produit produit=this.produits.get(idProduit);
		model.put("produit", produit);
		return new ModelAndView("addToPanier");
	}
	
	public void intialise(){
		panier=new Panier();
		produits=new HashMap<Long, Produit>();
		Produit p1=new Produit(50d, "pc", "ordinaeur", true);
		Produit p2=new Produit(10d, "canapé", "tres bien", false);
		produits.put(p1.getIdProduit(),p1);
		produits.put(p2.getIdProduit(),p2);
	}
}
