package ma.entities;

import java.io.Serializable; 
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: User
 *
 */
@Entity(name = "users")
public class User implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String nom;
	private String prenom;
	private String telephone;
	private Date dateNaissance;
	
//	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
//	private List<SmartPhone> smartphones;
	
	

	public User() {
		super();
	}   
	
	public User(int id, String email, String nom, String prenom, String telephone, Date dateNaissance) {
		super();
		this.id = id;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
	}
	
	public User(String email, String nom, String prenom, String telephone, Date dateNaissance) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}   
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	
//	public List<SmartPhone> getSmartphones() {
//		return smartphones;
//	}
//
//	public void setSmartphones(List<SmartPhone> smartphones) {
//		this.smartphones = smartphones;
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", telephone="
				+ telephone + ", dateNaissance=" + dateNaissance  + "]";
	}

	
}
