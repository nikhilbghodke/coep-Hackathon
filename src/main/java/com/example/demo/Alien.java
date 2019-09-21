package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ping")
public class Alien {


	
	@Id
	@Column(name="mac_Address")
	private String id;
	
	@Column(name="up_Time")
	private String uptime;
	
	@Column(name="start_Time")
	private String starttime;
	

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + uptime + "]";
	}	
}