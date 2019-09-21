package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="time_saved")
@IdClass(compositeKeyPsUtil.class)
public class timeSaved {

	@Id
	@Column(name="PC_ID")
	private String mac_Address;
	
	@Id
	@Column(name="Date")
	private String date_Time;
	
	@Column(name="Time_saved")
	private String timeSaved;
	
	@Column(name="uptime")
	private String uptime;

	public timeSaved() {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    this.date_Time = myDateObj.format(myFormatObj);
}
	public String getMac_Address() {
		return mac_Address;
	}

	public void setMac_Address(String mac_Address) {
		this.mac_Address = mac_Address;
	}

	public String getDate_Time() {
		return date_Time;
	}

	public void setDate_Time(String date_Time) {
		this.date_Time = date_Time;
	}

	public String getTimeSaved() {
		return timeSaved;
	}

	public void setTimeSaved(String timeSaved) {
		this.timeSaved = timeSaved;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	
}
