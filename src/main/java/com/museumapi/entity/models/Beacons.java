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
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Beacons")
public class Beacons implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_beacon")
	@NotNull
	private int idBeacon;
	
	@Column
	private boolean status;
	
	@OneToMany(mappedBy = "beacon", cascade = CascadeType.ALL)
	private Set<UserInteractions> uInteraction;

	public Beacons() {
		super();
	}

	public Beacons(@NotNull int idBeacon, boolean status, Set<UserInteractions> uInteraction) {
		super();
		this.idBeacon = idBeacon;
		this.status = status;
		this.uInteraction = uInteraction;
	}

	public int getIdBeacon() {
		return idBeacon;
	}

	public void setIdBeacon(int idBeacon) {
		this.idBeacon = idBeacon;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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