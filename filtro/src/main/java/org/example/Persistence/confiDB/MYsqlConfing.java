package org.example.Persistence.confiDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYsqlConfing {


    private static Connection connection=null;

    public static Connection OpenConnection() {

        String URL="jdbc:mysql://127.0.0.1:3306/RiwiAcademyDB";
        String user="root";
        String password="Rlwl2023.";

        try{
            connection= DriverManager.getConnection(URL,user,password); // que hace aquí?
            System.out.println("Connection succesful");
        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }

        return connection;
    }

    public static void closeConnection(){
        if(connection!=null){

            try{
                connection.close();
                System.out.println("Connection closed");
            }catch(SQLException e){
                throw new RuntimeException(e.getMessage()); // mirar tipos de erroresz
            }
        }
    }
}
