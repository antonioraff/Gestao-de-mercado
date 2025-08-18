package com.example;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produto {
    private String nome;
    private int qntd;
    private String val;
    private String codigo;
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Produto(){

    }

    public Produto(String nome, int qntd){
        this.nome = nome;
        this.qntd = qntd;
    }

    public Produto(String nome, int qntd, String val, String codigo){
        this.nome = nome;
        this.qntd = qntd;
        this.val = val;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQntd(){
        return qntd;
    }

    public void setQntd(int qntd){
        this.qntd = qntd;
    }

    public String getVal(){
        return val;
    }

    public void setVal(String val){
        this.val = val;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String toString(){
        String texto;
        texto = "";
        texto += "Nome do produto: " + getNome() + "\nQuantidade: " + getQntd() + "\nValor: R$" + getVal() + "\nCódigo: " + getCodigo();
        return texto;
    }
    

    //METODO PARA ADICIONAR PRODUTOS NA LISTA

    public void Adicionar(){

        String nomep, val, cod;
        int qntd;

        nomep = JOptionPane.showInputDialog(null, "Digite o nome do produto");
        qntd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade"));
        val = JOptionPane.showInputDialog(null, "Digite o valor do produto");
        cod = JOptionPane.showInputDialog(null, "Digite o código do produto");

        listaProdutos.add(new Produto(nomep, qntd, val, cod));
    }

    //METODO PARA LISTAR PRODUTOS ADICIONADOS 

    public void Listar(){
        if(!listaProdutos.isEmpty()){
            String texto = "Produtos do estoque: \n";
            
        for(Produto p : listaProdutos){
            texto += p.toString();
        }
            JOptionPane.showMessageDialog(null, texto);
        } 
        else{
            JOptionPane.showMessageDialog(null, "O estoque está vazio");

        }
    }
}