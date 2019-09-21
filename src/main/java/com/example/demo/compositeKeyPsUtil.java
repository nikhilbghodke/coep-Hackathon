package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

public class compositeKeyPsUtil implements Serializable {
    private String mac_Address;
    private String date_Time;

    
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
}
