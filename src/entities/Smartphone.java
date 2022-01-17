package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;


public class Smartphone implements Serializable {

	   
	
	private int id;
	private String imei;
	/*@OneToMany(mappedBy = "smartphone", fetch = FetchType.EAGER)
	private List<Position> positions;*/
	
	private User user;
	private static final long serialVersionUID = 1L;

	public Smartphone() {
		super();
	}   
	
	
	
//	public Smartphone(String imei, List<Position> positions, User user) {
//		super();
//		this.imei = imei;
//		this.positions = positions;
//		this.user = user;
//	}
	
	public Smartphone(String imei, User user) {
		super();
		this.imei = imei;
		this.user = user;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
//	public List<Position> getPositions() {
//		return positions;
//	}
//	public void setPositions(List<Position> positions) {
//		this.positions = positions;
//	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}



//	@Override
//	public String toString() {
//		return "Smartphone [id=" + id + ", imei=" + imei + ", positions=" + positions + ", user=" + user + "]";
//	}
	
	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", imei=" + imei + ", user=" + user + "]";
	}
	
	
   
}
