package com.idat.demo.ecf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.demo.ecf.modelo.Lavadora;
import com.idat.demo.ecf.repository.LavadoraRepository;

@Service
public class LavadoraServicelmpl implements LavadoraServicio {
	
	@Autowired
	private LavadoraRepository repository;
	@Override
	public List<Lavadora> listar() {
		return repository.findAll();
	}

}
