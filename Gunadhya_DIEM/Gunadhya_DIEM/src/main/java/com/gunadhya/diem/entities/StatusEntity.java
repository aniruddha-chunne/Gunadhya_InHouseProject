package com.gunadhya.diem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status_Table")
public class StatusEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String description;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public StatusEntity(int id, String description, String status) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
	}
	
	public StatusEntity(String description, String status) {
		super();
		this.description = description;
		this.status = status;
	}
	
	public StatusEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "StatusEntity [id=" + id + ", description=" + description + ", status=" + status + "]";
	}
	
}
