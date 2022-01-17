package ma.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2487707689704175433L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double latitude;
	private double longitude;
	private Date date;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private SmartPhone smartPhone;
	
	public Position() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Position(int id, double latitude, double longitude, Date date, SmartPhone smartPhone) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.smartPhone = smartPhone;
	}
	public Position(double latitude, double longitude, Date date, SmartPhone smartPhone) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.smartPhone = smartPhone;
	}
	public Position(int id,double latitude, double longitude, Date date) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.smartPhone = smartPhone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public SmartPhone getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(SmartPhone smartPhone) {
		this.smartPhone = smartPhone;
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", date=" + date
				+ ", smartPhone=" + smartPhone + "]";
	}
	
	

}
