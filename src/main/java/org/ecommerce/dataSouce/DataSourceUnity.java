package org.ecommerce.dataSouce;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.ecommerce.entities.Entite;
import org.ecommerce.entities.Produit;

public class DataSourceUnity<E extends Entite> {
	private Map<Long, E> entities;
	
	public DataSourceUnity(Collection<E> entities){
		this.entities=new HashMap<Long, E>();
		Iterator<E> entitiesIter=entities.iterator();
		
		while(entitiesIter.hasNext()){
			E entitie=entitiesIter.next();
			this.entities.put(entitie.getId(), entitie);
		}	
	}
	
	public Collection<E> getAllEntitie(){
		return this.entities.values();	
	}
	
	public E getById(Long id){
		return entities.get(id);
	}
	
	
	
	@Override
	public String toString() {
		return "DataSourceUnity [entities=" + entities + "]";
	}

	public static void main (String args[]){
		Collection<Produit> produits=new LinkedList<Produit>();
		produits.add(new Produit(5d, "cc", "tt", true));
		System.out.println(new DataSourceUnity<Produit>(produits).getById(1l));
	}
}
