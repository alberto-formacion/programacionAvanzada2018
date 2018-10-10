package com.sanluis.hbn.escuela.dao;

import java.util.List;

public interface CrudDAO<T> {

		public List<T> getAll();
		public T getById(T pojo);
		public boolean update(T pojo);
		public boolean delete(T pojo);
		public boolean insert(T pojo);
		
}
