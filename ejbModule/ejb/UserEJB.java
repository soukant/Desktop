package ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ma.entities.User;
import service.UserService;
@Stateless
@WebService
public class UserEJB {

	@EJB
	private UserService userService;
	@WebMethod
	public void create(@WebParam(name="nom") String nom,@WebParam(name="prenom") String prenom, @WebParam(name="email") String email,@WebParam(name="telephone") String telephone,@WebParam(name="dateNaissance") Date dateNaissance) {
		User v = new User(nom,prenom,email,telephone,dateNaissance);
		userService.create(v);
	}
	
	@WebMethod
	public List<User> listVehicules() {
		return userService.findAll();
	}
	@WebMethod
	public User findById(@WebParam(name="id") Long id) {
		return userService.findById(id);
	}
	@WebMethod
	public void delete(@WebParam(name="id") Long id) {
		userService.delete(findById(id));
	}
	
	
}
