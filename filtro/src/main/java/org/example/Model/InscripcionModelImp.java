package org.example.Model;

import org.example.Persistence.confiDB.MYsqlConfing;
import org.example.Persistence.imodel.iInscriptionModel;
import org.example.entities.Course;
import org.example.entities.Inscription;
import org.example.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InscripcionModelImp  implements iInscriptionModel {



    @Override
    public Inscription create(Inscription request){
        Connection connection= MYsqlConfing.OpenConnection();


        try{
            String sqlQuery="insert into inscription(id_student,id_course) values(?,?);";

            //preparedstatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //seting

            preparedStatement.setInt(1,request.getId_student());
            preparedStatement.setInt(2,request.getId_course());

            //query execution

            int rowAffected =preparedStatement.executeUpdate();
            if(rowAffected==1){
                System.out.println("\n" +
                        "successful upload");
                preparedStatement.close();
                MYsqlConfing.closeConnection();
                return request;
            }
        }catch(SQLException e){
            throw  new RuntimeException(e);
        }
        MYsqlConfing.closeConnection();
        return null;
    }

    @Override
    public Inscription readById(Integer id){


        Connection connection = MYsqlConfing.OpenConnection();

        Inscription inscription =null;

        try{
            //Create SQL

            String sqlQuery="select * from  inscription where id_inscription=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                inscription= new Inscription(
                        resultSet.getInt("id_inscription"),
                        resultSet.getInt("id_student"),
                        resultSet.getInt("id_course")
                );
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MYsqlConfing.closeConnection();
        return inscription;
    }


    @Override
    public void update(Integer id, Inscription request) {

        Connection connection = MYsqlConfing.OpenConnection();

        try{
            String sqlQUery="update inscription set id_student =?,id_course=? where id_inscription=?; ";

            //preparedstatement

            PreparedStatement preparedStatement= connection.prepareStatement(sqlQUery);

            //seting

            preparedStatement.setInt(3,id);
            preparedStatement.setInt(1,request.getId_student());
            preparedStatement.setInt(2,request.getId_course());




            preparedStatement.execute();

            preparedStatement.close();
            MYsqlConfing.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }
}
