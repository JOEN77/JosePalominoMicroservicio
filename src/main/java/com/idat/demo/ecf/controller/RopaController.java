package com.idat.demo.ecf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.demo.ecf.modelo.Ropa;
import com.idat.demo.ecf.service.RopaServicio;

@Controller
@RequestMapping("/ropa/v1")
public class RopaController {
	
	@Autowired
	private RopaServicio service;
	
	@GetMapping(path = "/listar")
	public @ResponseBody List<Ropa> listar(){
		return service.listar();
	}
	

}
