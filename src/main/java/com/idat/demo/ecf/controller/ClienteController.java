package com.idat.demo.ecf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.demo.ecf.modelo.Cliente;
import com.idat.demo.ecf.service.ClienteServicio;

@Controller
@RequestMapping("/cliente/v1")
public class ClienteController {
	
	@Autowired
	private ClienteServicio service;
	
	@GetMapping(path = "/listar")
	public  @ResponseBody List<Cliente> listar(){
		return service.listar();
	}
	

}
