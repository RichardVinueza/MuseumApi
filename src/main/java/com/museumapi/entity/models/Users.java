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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "users")
public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1249085882126761391L;
	
	@JsonView(Views.User.class)
	@Id
	@Column(name = "id_user")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	@JsonView(Views.User.class)
	@Column(name = "full_name")
	@NotEmpty
	private String fullName;
	
	@JsonView(Views.User.class)
	@Column
	@NotEmpty
	private String email;
	
	@JsonView(Views.User.class)
	@Column
	@NotEmpty
	private String nationality;
	
	@JsonView(Views.User.class)
	@Column
	@NotEmpty
	private String password;
	
	@JsonView(Views.User.class)
	@Column
	@NotNull
	private boolean admin;
	
	@JsonIgnoreProperties("user")
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

	public Users findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}