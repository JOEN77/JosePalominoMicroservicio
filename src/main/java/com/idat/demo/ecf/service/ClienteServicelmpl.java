package com.idat.demo.ecf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.demo.ecf.modelo.Cliente;
import com.idat.demo.ecf.repository.ClienteRepository;

@Service
public class ClienteServicelmpl implements ClienteServicio {
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listar(){
		return repository.findAll();
	}

}
