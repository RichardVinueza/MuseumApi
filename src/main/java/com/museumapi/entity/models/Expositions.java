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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name = "expositions")
public class Expositions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonView(Views.User.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "id_exposition")
	private int idExposition;
	
	@JsonView(Views.User.class)
	@Column
	private String name; 
	
	@JsonView(Views.User.class)
	@Column
	private String authors;
	
	@JsonView(Views.User.class)
	@Column(name = "artworks_number")
	private int artworksNumber;
	
	@JsonView(Views.User.class)
	@Column(name = "time_frame")
	private Timestamp timeFrame;
	
	@JsonView(Views.User.class)
	@Column
	private String image;
	
	@OneToMany(mappedBy = "expo", cascade = CascadeType.ALL)
	private Set<Beacons> beacons;
	
	@OneToMany(mappedBy = "resourceExpo", cascade = CascadeType.ALL)
	private Set<Resources> resourceExpo;
	
	@OneToMany(mappedBy = "artExpo", cascade = CascadeType.ALL)
	private Set<Artworks> artExpositions;

	public Expositions() {
		super();
	}

	public Expositions(@NotNull int idExposition, String name, String authors, int artworksNumber, Timestamp timeFrame,
			String image, Set<Beacons> beacons, Set<Resources> resourceExpo, Set<Artworks> artExpositions) {
		super();
		this.idExposition = idExposition;
		this.name = name;
		this.authors = authors;
		this.artworksNumber = artworksNumber;
		this.timeFrame = timeFrame;
		this.image = image;
		this.beacons = beacons;
		this.resourceExpo = resourceExpo;
		this.artExpositions = artExpositions;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Beacons> getBeacons() {
		return beacons;
	}

	public void setBeacons(Set<Beacons> beacons) {
		this.beacons = beacons;
	}

	public Set<Resources> getResourceExpo() {
		return resourceExpo;
	}

	public void setResourceExpo(Set<Resources> resourceExpo) {
		this.resourceExpo = resourceExpo;
	}

	public Set<Artworks> getArtExpositions() {
		return artExpositions;
	}

	public void setArtExpositions(Set<Artworks> artExpositions) {
		this.artExpositions = artExpositions;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}