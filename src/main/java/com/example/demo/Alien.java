package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {


	@Id
	@Column(name="macaddress")
	private Integer id;
	
	@Column(name="last")
	private String name;
	
	
	public Alien(){
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(); 
	    this.name=formatter.format(date);
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	this.name=name;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}	
}