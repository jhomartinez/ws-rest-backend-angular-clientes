package com.codigoj.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codigoj.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
