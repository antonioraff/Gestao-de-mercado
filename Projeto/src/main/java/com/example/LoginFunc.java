package com.example;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFunc {

    public void loginfunc() throws SQLException{

        int op = 0, senha;
        String cpf;
        char resp = 'N';

        Produto addprod = new Produto();
        Produto listar = new Produto();

        CadastroFunc cadastroFunc = new CadastroFunc();

        cpf = JOptionPane.showInputDialog(null, "Digite seu login");
        senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));
        
        ConnectionFactory connection = new ConnectionFactory();

        String sql = "SELECT COUNT(*) FROM funcionarios WHERE cpf = ? AND senha = ?";

        Connection conn = connection.recuperarConexao();
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, cpf);
        preparedStatement.setInt(2, senha);

        ResultSet resultSet = preparedStatement.executeQuery(); 

            if(resultSet.next()){
                
                int count = resultSet.getInt(1);

                if(count == 1){
                    do{  
            
                        JOptionPane.showMessageDialog(null, "BEM VINDO À CENTRAL\n\n1 - Adicionar produto ao estoque\n2 - Verificar produtos do estoque\n3 - Listar clientes cadastrados\n4 - Cadastrar novo funcionário\n0 - Sair");
                        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma opção"));

                        switch(op){
                            case 1: 
                                addprod.Adicionar();
                            break;

                            case 2:    
                                listar.Listar();
                            break;

                            case 3:

                            case 4:
                                cadastroFunc.cadastrofunc();
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