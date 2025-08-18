package com.example;

abstract class ConstPessoa{
    private String nome;
    private int idade;
    private String celular;
    private String email;
    private int log;
    private String senha;
   
    public ConstPessoa(){

    }

    public ConstPessoa(String nome, int idade, String celular){
        this.nome = nome;
        this.idade = idade;
        this.celular = celular;
    }

    public ConstPessoa(String nome, int idade, String celular, String email, int log, String senha){
        this.nome = nome;
        this.idade = idade;
        this.celular = celular;
        this.email = email;
        this.log = log;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getLog(){
        return log;
    }

    public void setLog(int log){
        this.log = log;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }
}