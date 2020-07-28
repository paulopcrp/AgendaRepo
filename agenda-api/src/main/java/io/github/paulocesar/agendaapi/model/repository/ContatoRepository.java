package io.github.paulocesar.agendaapi.model.repository;

import io.github.paulocesar.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
