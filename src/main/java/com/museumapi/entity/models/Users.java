package com.museumapi.entity.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class Users implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1249085882126761391L;

	@Id
	@Column(name = "id_user")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@Column(name = "full_name")
	@NotEmpty
	private String fullName;
	
	@Column
	@NotEmpty
	private String email;
	
	@Column
	@NotEmpty
	private String nationality;
	
	@Column
	@NotEmpty
	private String password;
	
	@Column
	@NotNull
	private boolean admin;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<UserInteractions> uInteraction;

	public Users() {
		super();
	}

	public Users(@NotNull int idUser, @NotEmpty String fullName, @NotEmpty String email, @NotEmpty String nationality,
			@NotEmpty String password, @NotNull boolean admin, Set<UserInteractions> uInteraction) {
		super();
		this.idUser = idUser;
		this.fullName = fullName;
		this.email = email;
		this.nationality = nationality;
		this.password = password;
		this.admin = admin;
		this.uInteraction = uInteraction;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Set<UserInteractions> getuInteraction() {
		return uInteraction;
	}

	public void setuInteraction(Set<UserInteractions> uInteraction) {
		this.uInteraction = uInteraction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}