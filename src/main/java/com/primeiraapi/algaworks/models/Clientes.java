package com.primeiraapi.algaworks.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable= false)
    private String nome;

    @Column(nullable = false)
    private String sobrenome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    public Long getId(){
        return id;
    };
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    };
    public void setNome(String nome){
        this.nome = nome;
    };
    
    public String getSobrenome(){
        return sobrenome;
    };
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    };

    public String getEmail(){
        return email;
    };
    public void setEmail(String email){
        this.email = email;
    };

    public String getSenha(){
        return senha;
    };
    public void setSenha(String senha){
        this.senha = senha;
    }
}
