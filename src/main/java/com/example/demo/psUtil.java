package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="psutil")
@IdClass(compositeKeyPsUtil.class)
public class psUtil {

	@Id
	@Column(name="mac_Address")
	private String mac_Address;
	
	@Id
	@Column(name="date_Time")
	private String date_Time;
	
	@Column(name="cpu_Usage")
	private String cpu_Usage;
	
	@Column(name="cpu_Frequency")
	private String cpu_Frequency;
	
	@Column(name="memory_Usage")
	private String memory_Usage;
	
	@Column(name="disk_Usage")
	private String disk_Usage;

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

	public String getCpu_Usage() {
		return cpu_Usage;
	}

	public void setCpu_Usage(String cpu_Usage) {
		this.cpu_Usage = cpu_Usage;
	}

	public String getCpu_Frequency() {
		return cpu_Frequency;
	}

	public void setCpu_Frequency(String cpu_Frequency) {
		this.cpu_Frequency = cpu_Frequency;
	}

	public String getMemory_Usage() {
		return memory_Usage;
	}

	public void setMemory_Usage(String memory_Usage) {
		this.memory_Usage = memory_Usage;
	}

	public String getDisk_Usage() {
		return disk_Usage;
	}

	public void setDisk_Usage(String disk_Usage) {
		this.disk_Usage = disk_Usage;
	}
	@Override
	public String toString() {
		return "psUtil [mac_Address=" + mac_Address + ", date_Time=" + date_Time + ", cpu_Usage=" + cpu_Usage
				+ ", cpu_Frequency=" + cpu_Frequency + ", memory_Usage=" + memory_Usage + ", disk_Usage=" + disk_Usage
				+ "]";
	}	
}