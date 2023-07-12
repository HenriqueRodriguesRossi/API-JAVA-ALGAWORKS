package com.primeiraapi.algaworks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.primeiraapi.algaworks.models.Clientes;
import com.primeiraapi.algaworks.repository.ClienteRepository;



@RestController
@RequestMapping("/clientes")
public class ClientesController {
    
    /*O Autowired já injeta uma instância de cliente Repository*/
    @Autowired
    private ClienteRepository clienteRepository;
    
    @GetMapping
    @RequestMapping("/listar")
    public List<Clientes> listar(){
        return clienteRepository.findAll();
    };

    @PostMapping
    @RequestMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes cadastro(@RequestBody Clientes clientes){
        return clienteRepository.save(clientes);
    }
}
