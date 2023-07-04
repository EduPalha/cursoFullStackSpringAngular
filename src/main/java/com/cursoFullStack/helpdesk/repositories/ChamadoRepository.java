package com.cursoFullStack.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoFullStack.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
