package com.museumapi.entity.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_interactions")
public class UserInteractions implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(name = "usersid_user")
	private Users user;
	
	@Id
	@NotNull
	@ManyToOne
	@JoinColumn(name = "beaconsid_beacon")
	private Beacons beacon;
	
	@Id
	@NotNull
	@Column(name = "date_interaction")
	private Timestamp dateInteraction;

	public UserInteractions() {
		super();
	}

	public UserInteractions(@NotNull Users user, @NotNull Beacons beacon, @NotNull Timestamp dateInteraction) {
		super();
		this.user = user;
		this.beacon = beacon;
		this.dateInteraction = dateInteraction;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Beacons getBeacon() {
		return beacon;
	}

	public void setBeacon(Beacons beacon) {
		this.beacon = beacon;
	}

	public Timestamp getDateInteraction() {
		return dateInteraction;
	}

	public void setDateInteraction(Timestamp dateInteraction) {
		this.dateInteraction = dateInteraction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
