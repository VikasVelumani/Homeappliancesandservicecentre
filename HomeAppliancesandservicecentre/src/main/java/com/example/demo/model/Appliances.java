package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentno1")
public class Appliances {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String applianceName;
	private String brand;
	private String modelNumber;
	private String service;
	private String phno;
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApplianceName() {
		return applianceName;
	}
	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	
	
	public Appliances(int id, String applianceName, String brand, String modelNumber, String service, String phno) {
		super();
		this.id = id;
		this.applianceName = applianceName;
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.service = service;
		this.phno = phno;
	}

	public Appliances() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
