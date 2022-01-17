package dao;

import java.util.List;


public interface IdaoLocal<T> {
	boolean create(T p);

	boolean update(T p);

	boolean delete(int id);

	T findById(int id);

	List<T> findAll();
}
