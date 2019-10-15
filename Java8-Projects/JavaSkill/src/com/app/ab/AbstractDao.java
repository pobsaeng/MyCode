package com.app.ab;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T)key;
	}

	public void persist(T entity) {
		
	}

	public void delete(T entity) {
		
	}
}
