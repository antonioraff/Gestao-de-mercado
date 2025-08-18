package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class CadastroCliente {
    
    public void cadastrocliente(){
        String nome, cpf, email, celular, senha;
        int idade;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        cpf = JOptionPane.showInputDialog(null, "Digite seu cpf");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        email = JOptionPane.showInputDialog(null, "Digite um email: ");
        senha = JOptionPane.showInputDialog(null, "Digite uma senha");
        celular = JOptionPane.showInputDialog(null, "Digite seu celular: ");

        ConstCliente constCliente = new ConstCliente(nome, celular, email, cpf, senhahashada(senha), idade);
        DadosCliente dados = new DadosCliente();
        dados.setDadosCliente(constCliente);

        ConnectionFactory connection = new ConnectionFactory();

        String sql = "INSERT INTO clientes (cpf, nome, senha, celular, idade, email) " + "VALUES (?,?,?,?,?,?)";

        try(Connection conn = connection.recuperarConexao();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);){
            
            preparedStatement.setString(1, cpf);
            preparedStatement.setString(2, nome);
            preparedStatement.setString(3, senhahashada(senha));
            preparedStatement.setString(4, celular);
            preparedStatement.setInt(5, idade);
            preparedStatement.setString(6, email);
            
            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

    public String senhahashada (String senha){
        String senhahashada = BCrypt.hashpw(senha, BCrypt.gensalt());
        return senhahashada;
    }
}