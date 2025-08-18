package com.example;

import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCliente {

    public void logincliente() throws SQLException{

        int op = 0;
        String login, senha;
        char resp = 'N';

        login = JOptionPane.showInputDialog(null, "Digite o CPF ou email cadastrado");
        senha = JOptionPane.showInputDialog("Digite sua senha");

        CadastroCliente senhahash = new CadastroCliente();

        senhahash.senhahashada(senha);
        
        ConnectionFactory connection = new ConnectionFactory();

        String sql = "SELECT senha FROM clientes WHERE cpf = ? OR email = ?";

        Connection conn = connection.recuperarConexao();
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, login);
        preparedStatement.setString(2, login);

        ResultSet resultSet = preparedStatement.executeQuery(); 

            if(resultSet.next()){
                
                String senhahashada = resultSet.getString("senha");

                if(BCrypt.checkpw(senha, senhahashada)){
                    do{  
                        JOptionPane.showMessageDialog(null, "BEM VINDO AO MERCADO\n1 - Verificar itens do mercado\n0 - Sair");
                        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma opção"));

                        switch(op){
                            case 1: 
                                
                            break;

                            case 2:    
            
                            break;

                            case 3:

                            case 4:
                                break;

                            case 0:
                                int confirmar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja sair?\n1 - Sim\n0 - Não\n"));
                                switch(confirmar){
                                    case 1:
                                        System.exit(1);
                                    case 0:
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Entrada não permitida.");
                                        break;
                                }

                            break;
                            
                            default:
                                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
                            break;

                        }
            
                    }while(resp == 'N');

                }
                else{
                    JOptionPane.showMessageDialog(null, "Dados invalidos, tente novamente");
                }

                conn.close();
            }
            else{
            }
    }
}