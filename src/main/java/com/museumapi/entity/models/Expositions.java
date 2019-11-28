package com.museumapi.entity.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	@NotEmpty
	private String name; 
	
	@Column
	private String authors;
	
	@Column(name = "artworks_number")
	private int artworksNumber;
	
	@Column(name = "time_frame")
	private Timestamp timeFrame;
}