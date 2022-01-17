package dao;

import java.util.List;

public interface IDao<ObjectT>{
	public boolean create(ObjectT object);
	public boolean update(ObjectT object);
	public boolean delete(ObjectT object);
	public ObjectT findById(Long id);
	public List<ObjectT> findAll();
}
