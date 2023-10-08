package com.diegomagalhaes.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomagalhaes.agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
