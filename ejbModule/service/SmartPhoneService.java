package service;



import javax.ejb.Remote;

import dao.IDao;
import ma.entities.SmartPhone;

@Remote
public interface SmartPhoneService extends IDao<SmartPhone>{

	public SmartPhone findByImei(String imei); 
}
