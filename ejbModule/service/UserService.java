package service;


import javax.ejb.Remote;


import dao.IDao;
import ma.entities.User;

@Remote
public interface UserService extends IDao<User>{

	
}
