package com.src.dto;


public class Product {
	int idproduct;
	String p_name;
	String p_packket;
	String p_address;
	String dates;

	public Product(int idproduct, String p_name, String p_packket, String p_address, String dates) {
		super();
		this.idproduct = idproduct;
		this.p_name = p_name;
		this.p_packket = p_packket;
		this.p_address = p_address;
		this.dates = dates;
	}

	public Product() {
	}

	public int getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_packket() {
		return p_packket;
	}

	public void setP_packket(String p_packket) {
		this.p_packket = p_packket;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "Product [idproduct=" + idproduct + ", p_name=" + p_name + ", p_packket=" + p_packket + ", p_address="
				+ p_address + ", dates=" + dates + "]";
	}
}
