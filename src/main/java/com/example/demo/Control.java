package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Control {

	@Autowired
	AlienRepo repo;
	
	@Autowired
	psUtilRepo psutilrepo;
	
	@Autowired
	pcRepo pcrepo;
	
	
	@RequestMapping("/ping")
	@ResponseBody
	public long add(Packet b) {
		
		//saving data related to ping table
		Alien a= new Alien();
		a.setId(b.mac);
		a.setStarttime(b.starttime);
		a.setUptime(b.uptime);
		repo.save(a);	
		
		//saving data related to psutil
		System.out.println(b.toString());
		psUtil psutil= new psUtil();
		psutil.setMac_Address(b.mac);
		psutil.setDate_Time(b.dateAndTime);
		psutil.setDisk_Usage(b.diskUsage);
		psutil.setMemory_Usage(b.memoryUsage);
		psutil.setCpu_Usage(b.cpuUsage);
		psutil.setCpu_Frequency(b.cpuFrequency);
		psutilrepo.save(psutil);
		
		//saving data related to pc
		pc PC= new pc();
		PC.setLab_No(b.labNo);
		PC.setMac_Address(b.getMac());
		PC.setOS(b.os);
		pcrepo.save(PC);
	
		return repo.count();
	}
	

	@RequestMapping("getAll")
	@ResponseBody
	public List<Alien> getAllAlien() {
		
		System.out.println(repo.count());
		return (List<Alien>) repo.findAll();
	}
	
	@RequestMapping("mac/{id}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable String id) {
		return repo.findById(id);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello";
	}
	
}