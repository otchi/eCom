package org.ecommerce.dao;

import java.util.Collection;

public interface IDao<E> {
	public E getbyId(Long id);
	public Collection<E> getAll();
}
