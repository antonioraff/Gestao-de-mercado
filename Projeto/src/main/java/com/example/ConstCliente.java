package com.example;

public class ConstCliente {
    private int idade;
    private String nome, cpf, celular, email, senhahashada;

    public ConstCliente(){
    }

    public ConstCliente(String nome, String celular, String email, String cpf, String senhahashada, int idade){
        this.nome=nome;
        this.celular=celular;
        this.email=email;
        this.cpf=cpf;
        this.senhahashada=senhahashada;
        this.idade=idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular=celular;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getSenhaHashada(){
        return senhahashada;
    }

    public void setSenhaHashada(String senhahashada){
        this.senhahashada=senhahashada;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
}

class DadosCliente{
    
    private int idade;
    private String nome, cpf, celular, email, senhahashada;

    public void setDadosCliente(ConstCliente dados){
        this.nome = dados.getNome();
        this.celular = dados.getCelular();
        this.email = dados.getEmail();
        this.cpf = dados.getCpf();
        this.senhahashada = dados.getSenhaHashada();
        this.idade = dados.getIdade();
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular=celular;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getSenhaHashada(){
        return senhahashada;
    }

    public void setSenha(String senhahashada){
        this.senhahashada=senhahashada;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
}