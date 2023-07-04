package com.cursoFullStack.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoFullStack.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
