package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionFactory {

    Dotenv dotenv = Dotenv.load();

    public Connection recuperarConexao(){

        String DBurl = dotenv.get("DB_URL");
        String DBUser = dotenv.get("DB_USER");
        String DBSenha = dotenv.get("DB_PASSWORD");

        try{
            return DriverManager.getConnection(DBurl, DBUser, DBSenha);
        
        } catch (SQLException e){

            throw new RuntimeException(e);
        }
    }
    public static void main(String... x){

    }   
}