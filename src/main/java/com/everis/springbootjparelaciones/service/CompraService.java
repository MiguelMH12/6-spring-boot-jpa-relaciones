package com.everis.springbootjparelaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.springbootjparelaciones.model.Compra;
import com.everis.springbootjparelaciones.repository.CompraRepository;

@Service
public class CompraService {
	@Autowired
	private CompraRepository compraRepository;
	
	public List<Compra> listar(){
		return compraRepository.findAll();
	}

}
