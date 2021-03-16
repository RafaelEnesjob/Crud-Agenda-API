package com.agenda.agendaapi.repository;

import com.agenda.agendaapi.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
