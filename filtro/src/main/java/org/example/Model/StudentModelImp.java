package org.example.Model;

import org.example.Persistence.confiDB.MYsqlConfing;
import org.example.Persistence.imodel.iStudentModel;
import org.example.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentModelImp  implements iStudentModel {

    @Override
    public Student create(Student request) {
        Connection connection= MYsqlConfing.OpenConnection();


        try{
            String sqlQuery="insert into student(name,email,id_qualification) values(?,?,?);";

            //preparedstatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //seting

            preparedStatement.setString(1,request.getName());
            preparedStatement.setString(2,request.getEmail());
            preparedStatement.setInt(3,request.getInt_qualification());
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
    public Student readById(Integer id){


        Connection connection = MYsqlConfing.OpenConnection();

        Student student =null;

        try{
            //Create SQL

            String sqlQuery="select * from student where id_student=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                student= new Student(
                        resultSet.getInt("id_student"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getInt("id_qualification"),
                        resultSet.getString("status")
                );
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MYsqlConfing.closeConnection();
        return student;
    }

    @Override
    public Student readByName(String name){
        Connection connection = MYsqlConfing.OpenConnection();
        Student student = null;
        try{
            //query
            String sqlQuery= "select * from student where name like ?;";

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"%"+name+"%");

            preparedStatement.execute(); // ejecuta el query

            ResultSet resultSet= preparedStatement.getResultSet();
            if(resultSet.next()){
                student = new Student(
                        resultSet.getInt("id_student"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getInt("id_qualification"),
                        resultSet.getString("status")
                );
                preparedStatement.close();
                MYsqlConfing.closeConnection();
                return student;
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        MYsqlConfing.closeConnection();
        return student;
    }


    @Override
    public void update(Integer id, Student request) {

        Connection connection = MYsqlConfing.OpenConnection();

        try{
            String sqlQUery="update student set name=?,email=?,id_qualification=?,status=? where id_student=?; ";

            //preparedstatement

            PreparedStatement preparedStatement= connection.prepareStatement(sqlQUery);

            //seting
            preparedStatement.setInt(5,id);
            preparedStatement.setString(1,request.getName());
            preparedStatement.setString(2,request.getEmail());
            preparedStatement.setInt(3,request.getInt_qualification());
            preparedStatement.setString(4,request.getStatus());


            preparedStatement.execute();

            preparedStatement.close();
            MYsqlConfing.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }


    @Override
    public void delete(Integer id){

        Connection connection=MYsqlConfing.OpenConnection();

        try{

            // create SQL

            String sqlQuery="delete from student where id_student = ?;";
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,id);

            //prepardstatement execute
            preparedStatement.execute();

            preparedStatement.close();
            MYsqlConfing.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

}
