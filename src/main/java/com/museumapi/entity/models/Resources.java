package com.museumapi.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonView;
 
@Entity
@Table(name = "resources")
public class Resources implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonView(Views.User.class)
	@Id 
	@Column(name = "id_resource")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int idResource;
	
	@JsonView(Views.User.class)
	@Column
	private String type;
	
	@JsonView(Views.User.class)
	@Column 
	private String link;
	
	@JsonView(Views.User.class)
	@ManyToOne
	@JoinColumn(name = "expositionsid_exposition")
	private Expositions	resourceExpo;
	
	@JsonView(Views.User.class)
	@ManyToOne
	@JoinColumn(name = "artworksid_artwork")
	private Artworks resourceArtWork;

	public Resources() {
		super();
	}

	public Resources(@NotNull int idResource, String type, String link, Expositions resourceExpo,
			Artworks resourceArtWork) {
		super();
		this.idResource = idResource;
		this.type = type;
		this.link = link;
		this.resourceExpo = resourceExpo;
		this.resourceArtWork = resourceArtWork;
	}

	public int getIdResource() {
		return idResource;
	}

	public void setIdResource(int idResource) {
		this.idResource = idResource;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Expositions getResourceExpo() {
		return resourceExpo;
	}

	public void setResourceExpo(Expositions resourceExpo) {
		this.resourceExpo = resourceExpo;
	}

	public Artworks getResourceArtWork() {
		return resourceArtWork;
	}

	public void setResourceArtWork(Artworks resourceArtWork) {
		this.resourceArtWork = resourceArtWork;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
