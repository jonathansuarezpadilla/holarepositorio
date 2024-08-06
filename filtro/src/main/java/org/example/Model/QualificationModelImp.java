package org.example.Model;

import org.example.Persistence.confiDB.MYsqlConfing;
import org.example.Persistence.imodel.iQualificationModel;
import org.example.entities.Qualification;
import org.example.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QualificationModelImp implements iQualificationModel {



    @Override
    public Qualification create(Qualification request){
        Connection connection= MYsqlConfing.OpenConnection();


        try{
            //(corregir)
            String sqlQuery="insert into qualification(qualificationONe,qualificationTwo,qualificationThree) values(?,?,?);";

            //preparedstatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //seting(corregir)

            preparedStatement.setInt(1,request.getQualificationONe());
            preparedStatement.setInt(2,request.getQualificationTwo());
            preparedStatement.setInt(3,request.getQualificationThree());
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
    public Qualification readById(Integer id){


        Connection connection = MYsqlConfing.OpenConnection();

        Qualification qualification =null;

        try{
            //Create SQL

            String sqlQuery="select * from qualification where id_quialification=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                qualification= new Qualification(
                        resultSet.getInt("id_quialification"),
                        resultSet.getInt("qualificationONe"),
                        resultSet.getInt("qualificationTwo"),
                        resultSet.getInt("qualificationThree")
                );
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MYsqlConfing.closeConnection();
        return qualification;
    }

    @Override
    public void update(Integer id, Qualification request) {

        Connection connection = MYsqlConfing.OpenConnection();

        try{
            String sqlQUery="update qualification set qualificationONe =?,qualificationTwo=?,qualificationThree=? where id_quialification=?; ";

            //preparedstatement

            PreparedStatement preparedStatement= connection.prepareStatement(sqlQUery);

            //seting
            preparedStatement.setInt(4,id);
            preparedStatement.setInt(1,request.getQualificationONe());
            preparedStatement.setInt(2,request.getQualificationTwo());
            preparedStatement.setInt(3,request.getQualificationThree());



            preparedStatement.execute();

            preparedStatement.close();
            MYsqlConfing.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

}
