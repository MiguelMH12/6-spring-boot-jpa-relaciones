package com.everis.springbootjparelaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.springbootjparelaciones.model.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer>{
	
}
