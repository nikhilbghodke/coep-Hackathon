package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pclab")
public class pcAndLab {

	@Column(name="lab_No")
	private String lab_No;

	@Id
	@Column(name="pc")
	private String pc;

	public String getLab_No() {
		return lab_No;
	}

	public void setLab_No(String lab_No) {
		this.lab_No = lab_No;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}
}
