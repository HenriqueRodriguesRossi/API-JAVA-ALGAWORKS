package com.primeiraapi.algaworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primeiraapi.algaworks.models.Clientes;

/*A classe Repository é a responsável por interagir com o banco de dados*/
@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long>{
    /*O Spring Data JPA já implementa em runtime os métodos básicos como: CREATE, READ, DELETE e etc...*/
}
