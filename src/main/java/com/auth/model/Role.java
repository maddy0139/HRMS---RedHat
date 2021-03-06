package com.auth.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "roles")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@NotBlank
	@Size(max = 60)
	@NaturalId
	private RoleName name;

	public Role() {
		super();
	}

	public Role(Long id, @NotBlank @Size(max = 60) RoleName name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public RoleName getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(RoleName name) {
		this.name = name;
	}
	
	
	
}
