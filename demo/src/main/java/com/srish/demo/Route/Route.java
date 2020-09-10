package com.srish.demo.Route;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srish.demo.Entity.Employee;
import com.srish.demo.repo.empRepository;

@RestController
@RequestMapping("/api")
public class Route {
	
	@Autowired
	public empRepository repo;

	@PostMapping("/employee")
	public Employee save(Employee emp) {
		
		return repo.save(emp);
	}
	
	@GetMapping("/All")
	public List<Employee> getAll(){
		
		return repo.findAll();
	}
}
