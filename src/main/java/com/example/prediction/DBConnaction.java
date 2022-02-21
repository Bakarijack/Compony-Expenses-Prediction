package com.example.prediction;


import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnaction {
    public Connection conLink;

    public Connection getConnection() {
        String databaseName = "prediction";
        String databaseUser = "root";
        String databasePassword = "";
        String url = "jdbc:mysql://localhost/"+databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch(Exception e){
            e.printStackTrace();
        }

        return conLink;
    }

}
