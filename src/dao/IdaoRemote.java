package dao;

import java.util.List;


public interface IdaoRemote<T> {
	boolean create(T p);

	boolean update(T p);

	boolean delete(int id);

	T findById(int id);

	List<T> findAll();
}
