package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroFunc {
    
    public void cadastrofunc() throws SQLException{
        String nome, cpf, email, celular;
        int idade, senha;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        cpf = JOptionPane.showInputDialog(null, "Digite seu cpf");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        email = JOptionPane.showInputDialog(null, "Digite um email: ");
        senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma senha"));
        celular = JOptionPane.showInputDialog(null, "Digite seu celular: ");

        ConstFunc constFunc = new ConstFunc(nome, celular, email, cpf, senha, idade);
        DadosFunc dados = new DadosFunc();
        dados.setDadosFunc(constFunc);
        
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");

        ConnectionFactory connection = new ConnectionFactory();

        String sql = "INSERT INTO funcionarios (cpf, nome, senha, celular, idade, email) " + "VALUES (?,?,?,?,?,?)";

        Connection conn = connection.recuperarConexao();
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, cpf);
        preparedStatement.setString(2, nome);
        preparedStatement.setInt(3, senha);
        preparedStatement.setString(4, celular);
        preparedStatement.setInt(5, idade);
        preparedStatement.setString(6, email);

        preparedStatement.execute();

        preparedStatement.close();
        conn.close();
    }
}