package com.museumapi.entity.models;

import java.io.Serializable;
import java.sql.Timestamp;
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

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "expositions")
public class Expositions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "id_exposition")
	private int idExposition;
	
	@Column
	private String name; 
	
	@Column
	private String authors;
	
	@Column(name = "artworks_number")
	private int artworksNumber;
	
	@Column(name = "time_frame")
	private Timestamp timeFrame;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "expo", cascade = CascadeType.ALL)
	private Set<Beacons> beacons;

	public Expositions() {
		super();
	}

	public Expositions(@NotNull int idExposition, String name, String authors, int artworksNumber, Timestamp timeFrame,
			Set<Beacons> beacons) {
		super();
		this.idExposition = idExposition;
		this.name = name;
		this.authors = authors;
		this.artworksNumber = artworksNumber;
		this.timeFrame = timeFrame;
		this.beacons = beacons;
	}

	public int getIdExposition() {
		return idExposition;
	}

	public void setIdExposition(int idExposition) {
		this.idExposition = idExposition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public int getArtworksNumber() {
		return artworksNumber;
	}

	public void setArtworksNumber(int artworksNumber) {
		this.artworksNumber = artworksNumber;
	}

	public Timestamp getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(Timestamp timeFrame) {
		this.timeFrame = timeFrame;
	}

	public Set<Beacons> getBeacons() {
		return beacons;
	}

	public void setBeacons(Set<Beacons> beacons) {
		this.beacons = beacons;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}