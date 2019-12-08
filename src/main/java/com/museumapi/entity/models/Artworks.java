package com.museumapi.entity.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "artworks")
public class Artworks implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonView(Views.User.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_artwork")
	@NotNull
	private int idArtwork;
	
	@JsonView(Views.User.class)
	@Column
	private String name;
	
	@JsonView(Views.User.class)
	@Column(name = "author_full_name")
	private String authorFullName;
	
	@JsonView(Views.User.class)
	@Column(name = "author_nationality")
	private String authorNationality;
	
	@JsonView(Views.User.class)
	@Column
	private String category;
	
	@JsonView(Views.User.class)
	@Column(name = "creation_date")
	private int creationDate;
	
	@JsonView(Views.User.class)
	@Column(name = "creation_period")
	private String creationPeriod;
	
	@JsonView(Views.User.class)
	@Column
	private String image;
	
	@JsonView(Views.User.class)
	@ManyToOne
	@JoinColumn(name = "expositionsid_exposition")
	@NotNull
	private Expositions artExpo;
	
	@OneToMany(mappedBy = "resourceArtWork", cascade = CascadeType.ALL)
	private Set<Resources> resourcesArtWorks;

	public Artworks() {
		super();
	}

	public Artworks(@NotNull int idArtwork, String name, String authorFullName, String authorNationality,
			String category, int creationDate, String creationPeriod, String image, @NotNull Expositions artExpo,
			Set<Resources> resourcesArtWorks) {
		super();
		this.idArtwork = idArtwork;
		this.name = name;
		this.authorFullName = authorFullName;
		this.authorNationality = authorNationality;
		this.category = category;
		this.creationDate = creationDate;
		this.creationPeriod = creationPeriod;
		this.image = image;
		this.artExpo = artExpo;
		this.resourcesArtWorks = resourcesArtWorks;
	}

	public int getIdArtwork() {
		return idArtwork;
	}

	public void setIdArtwork(int idArtwork) {
		this.idArtwork = idArtwork;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorFullName() {
		return authorFullName;
	}

	public void setAuthorFullName(String authorFullName) {
		this.authorFullName = authorFullName;
	}

	public String getAuthorNationality() {
		return authorNationality;
	}

	public void setAuthorNationality(String authorNationality) {
		this.authorNationality = authorNationality;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(int creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationPeriod() {
		return creationPeriod;
	}

	public void setCreationPeriod(String creationPeriod) {
		this.creationPeriod = creationPeriod;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Expositions getArtExpo() {
		return artExpo;
	}

	public void setArtExpo(Expositions artExpo) {
		this.artExpo = artExpo;
	}

	public Set<Resources> getResourcesArtWorks() {
		return resourcesArtWorks;
	}

	public void setResourcesArtWorks(Set<Resources> resourcesArtWorks) {
		this.resourcesArtWorks = resourcesArtWorks;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
