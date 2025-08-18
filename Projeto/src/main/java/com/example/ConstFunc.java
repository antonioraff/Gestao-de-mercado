package com.example;

public class ConstFunc {
    private int senha, idade;
    private String nome, cpf, celular, email;

    public ConstFunc(){
    }

    public ConstFunc(String nome, String celular, String email, String cpf, int senha, int idade){
        this.nome=nome;
        this.celular=celular;
        this.email=email;
        this.cpf=cpf;
        this.senha=senha;
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

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha=senha;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
}

class DadosFunc{
    
    private int senha, idade;
    private String nome, cpf, celular, email;

    public void setDadosFunc(ConstFunc dados){
        this.nome = dados.getNome();
        this.celular = dados.getCelular();
        this.email = dados.getEmail();
        this.cpf = dados.getCpf();
        this.senha = dados.getSenha();
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

    public int getSenha(){
        return senha;
    }

    public void setSenha(int senha){
        this.senha=senha;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
}