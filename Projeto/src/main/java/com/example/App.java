package com.example;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int op = 0;
        char resp = 'N';

        LoginCliente logincliente = new LoginCliente();
        LoginFunc loginfunc = new LoginFunc();
        CadastroCliente cadastrocliente = new CadastroCliente();

        do{
            JOptionPane.showMessageDialog(null, "Faça seu login\n1 - Entrar como cliente\n2 - Entrar como funcionário\n\nNão possui cadastro? Então digite 3\n\nSair(0)");
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma opção"));

            switch(op){
                
                case 1:
                    logincliente.logincliente();
                break;

                case 2:
                    loginfunc.loginfunc();
                break;

                case 3:
                    cadastrocliente.cadastrocliente();
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
}