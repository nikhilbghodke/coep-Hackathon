package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pc")
public class pc {

	@Id
	@Column(name="mac_Address")
	private String mac_Address;
	
	@Column(name="lab_No")
	private String lab_No;

	@Column(name="OS")
	private String OS;

	public String getMac_Address() {
		return mac_Address;
	}

	public void setMac_Address(String mac_Address) {
		this.mac_Address = mac_Address;
	}

	public String getLab_No() {
		return lab_No;
	}

	public void setLab_No(String lab_No) {
		this.lab_No = lab_No;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}
	
}
