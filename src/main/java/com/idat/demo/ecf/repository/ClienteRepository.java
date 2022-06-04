package com.idat.demo.ecf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.demo.ecf.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findAll();
	

	
}
