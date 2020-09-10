package com.srish.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srish.demo.Entity.Employee;

@Repository
public interface empRepository extends JpaRepository<Employee, Integer> {

}
