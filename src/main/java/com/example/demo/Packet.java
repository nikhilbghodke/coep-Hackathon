package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Packet {

	public String mac;
	
	//ping 
	public String starttime;
	public String uptime;
	
	//psutil
	public String dateAndTime;
	public String cpuUsage;
	public String cpuFrequency;
	public String memoryUsage;
	public String diskUsage;
	
	//pc
	public String labNo;
	public String os;
	
	public Packet() {
			LocalDateTime myDateObj = LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		    this.dateAndTime = myDateObj.format(myFormatObj);
		    
	}
	
	public String getLabNo() {
		return labNo;
	}



	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}



	public String getOs() {
		return os;
	}



	public void setOs(String os) {
		this.os = os;
	}



	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getCpuUsage() {
		return cpuUsage;
	}
	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
	public String getCpuFrequency() {
		return cpuFrequency;
	}
	public void setCpuFrequency(String cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}
	public String getMemoryUsage() {
		return memoryUsage;
	}
	public void setMemoryUsage(String memoryUsage) {
		this.memoryUsage = memoryUsage;
	}
	public String getDiskUsage() {
		return diskUsage;
	}
	public void setDiskUsage(String diskUsage) {
		this.diskUsage = diskUsage;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	@Override
	public String toString() {
		return "Packet [mac=" + mac + ", starttime=" + starttime + ", uptime=" + uptime + ", dateAndTime=" + dateAndTime
				+ ", cpuUsage=" + cpuUsage + ", cpuFrequency=" + cpuFrequency + ", memoryUsage=" + memoryUsage
				+ ", diskUsage=" + diskUsage + "]";
	}



	
}
