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
	
	
	@RequestMapping("/ping")
	@ResponseBody
	public long add(Alien a) {
		repo.save(a);	
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
	public Optional<Alien> getAlien(@PathVariable Integer id) {
		return repo.findById(id);
	}
}