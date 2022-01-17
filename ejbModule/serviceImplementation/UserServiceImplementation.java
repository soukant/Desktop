package serviceImplementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.entities.User;
import service.UserService;
@Stateless(name = "User")
public class UserServiceImplementation implements UserService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Location_EJB");
	EntityManager entityManager = emf.createEntityManager();
	//Create Method
	@Override
	public boolean create(User object) {
		if(object == null)
			return false;
		else
		{
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.getTransaction().commit();
			return true;
		}
	}
	//Update Method
	@Override
	public boolean update(User object) {
		if(object == null)
			return false;
		else
		{
			entityManager.getTransaction().begin();
			User userContainer = entityManager.find(User.class, object.getId());
			userContainer.setNom(object.getNom());
			userContainer.setPrenom(object.getPrenom());
			userContainer.setEmail(object.getEmail());
			userContainer.setTelephone(object.getTelephone());
			userContainer.setDateNaissance(object.getDateNaissance());

			entityManager.persist(userContainer);
			entityManager.getTransaction().commit();
			return true;
		}
	}
	//Delete Method
	@Override
	public boolean delete(User object) {
		if(object == null)
			return false;
		else
		{
			try {
				entityManager.getTransaction().begin();
				User userContainer = entityManager.find(User.class, object.getId());
				entityManager.remove(userContainer);
				entityManager.getTransaction().commit();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
	//FindById Method
	@Override
	public User findById(Long id) {
		try {
			entityManager.getTransaction().begin();
			User userContainer = entityManager.find(User.class, id);
			entityManager.getTransaction().commit();
			return userContainer;
		}catch (Exception e) {
			return null;
		}
	}
	//FindAll
	@Override
	public List<User> findAll() {
		
		Query query = entityManager.createQuery("from User");
		return query.getResultList();
	}
}
