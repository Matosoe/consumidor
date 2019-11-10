package br.com.perfilcar.consumidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.perfilcar.consumidor.models.Log;


public interface LogRepository  extends JpaRepository<Log,Long> {

}
