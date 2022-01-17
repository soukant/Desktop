package ma.entities;

import java.io.Serializable; 
import java.lang.String;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: SmartPhone
 *
 */
@Entity

public class SmartPhone implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imei;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
//	@OneToMany(mappedBy = "smartPhone",fetch = FetchType.EAGER)
//	private List<Position> postions;
	
	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String imei) {
		super();
		this.imei = imei;
	}
	
	
	public SmartPhone(int id, String imei, User user) {
		super();
		this.id = id;
		this.imei = imei;
		this.user = user;
	}
	

//	public List<Position> getPostions() {
//		return postions;
//	}
//
//	public void setPostions(List<Position> postions) {
//		this.postions = postions;
//	}

	public SmartPhone(String imei, User user) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", imei=" + imei + ", user=" + user +"]";
	}
   
}
