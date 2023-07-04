package com.cursoFullStack.helpdesk.repositories;

import com.cursoFullStack.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
