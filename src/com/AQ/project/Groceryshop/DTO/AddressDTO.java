package com.AQ.project.Groceryshop.DTO;

public class AddressDTO {
	
	private String buildingno;
	private String area;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	AddressDTO(){
		 System.out.println("invoking" + getClass().getSimpleName()+"constructor");
	 }

	public String getBuildingno() {
		return buildingno;
	}

	public void setBuildingno(String buildingno) {
		this.buildingno = buildingno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	

}
