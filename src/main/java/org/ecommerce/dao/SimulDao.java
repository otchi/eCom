package org.ecommerce.dao;

import java.util.Collection;

import org.ecommerce.dataSouce.DataSourceUnity;
import org.ecommerce.entities.Entite;

public class SimulDao<E extends Entite>  implements IDao<E>{
	//public final static ApplicationContext CONTEXT= new ClassPathXmlApplicationContext("classpath:*src/main/resources/DataSetBeans.xml"); 
	DataSourceUnity<E> dataSource;
	
	public SimulDao(){
		// init dao
	}
	@Override
	public E getbyId(Long id) {
		// TODO Auto-generated method stub
		return this.dataSource.getById(id);
	}

	@Override
	public Collection<E> getAll() {
		// TODO Auto-generated method stub
		return this.dataSource.getAllEntitie();
	}
	
	public static void main(String args[]){
		new SimulDao<Entite>();
	}

}
