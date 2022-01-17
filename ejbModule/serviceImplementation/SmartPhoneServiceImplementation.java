package serviceImplementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.entities.SmartPhone;
import service.SmartPhoneService;
@Stateless
public class SmartPhoneServiceImplementation implements SmartPhoneService{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Location_EJB");
	EntityManager entityManager = emf.createEntityManager();
	//Create Method
	@Override
	public boolean create(SmartPhone object) {
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
	public boolean update(SmartPhone object) {
		if(object == null)
			return false;
		else
		{
			entityManager.getTransaction().begin();
			SmartPhone phoneContainer = entityManager.find(SmartPhone.class, object.getId());
			phoneContainer.setImei(object.getImei());
			entityManager.persist(phoneContainer);
			entityManager.getTransaction().commit();
			return true;
		}
	}
	//Delete Method
	@Override
	public boolean delete(SmartPhone object) {
		if(object == null)
			return false;
		else
		{
			try {
				entityManager.getTransaction().begin();
				SmartPhone phoneContainer = entityManager.find(SmartPhone.class, object.getId());
				entityManager.remove(phoneContainer);
				entityManager.getTransaction().commit();
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}
	//FindById Method
	@Override
	public SmartPhone findById(Long id) {
		try {
			entityManager.getTransaction().begin();
			SmartPhone phoneContainer = entityManager.find(SmartPhone.class, id);
			entityManager.getTransaction().commit();
			return phoneContainer;
		}catch (Exception e) {
			return null;
		}
	}
	//FindAll
	@Override
	public List<SmartPhone> findAll() {
		Query query = entityManager.createQuery("from GpsTracker");
		return query.getResultList();
	}
	@Override
	public SmartPhone findByImei(String imei) { 
		Query query = entityManager.createQuery("select g FROM SmartPhone g WHERE g.imei=:imei").setParameter("imei", imei);
		return (SmartPhone) query.getSingleResult();
	}
	
	
}
