package org.example.Model;

import org.example.Persistence.confiDB.MYsqlConfing;
import org.example.Persistence.imodel.iCourseModel;
import org.example.entities.Course;
import org.example.entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseModelImp implements iCourseModel {



    @Override

    public Course create(Course request){
        Connection connection= MYsqlConfing.OpenConnection();

        try{
            String sqlQuery="insert into course(nameCourse,description,teacher) values(?,?,?);";

            //preparedstatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //seting

            preparedStatement.setString(1,request.getNameCourse());
            preparedStatement.setString(2,request.getDescription());
            preparedStatement.setString(3,request.getTeacher());
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
    public Course readById(Integer id){


        Connection connection = MYsqlConfing.OpenConnection();

        Course course =null;

        try{
            //Create SQL

            String sqlQuery="select * from course where id_course=?;";

            //PreparedStatement
            PreparedStatement preparedStatement= connection.prepareStatement(sqlQuery);

            //Assing to ?
            preparedStatement.setInt(1,id);

            //execute
            preparedStatement.execute();

            ResultSet resultSet= preparedStatement.getResultSet();

            if (resultSet.next()){
                course= new Course(
                        resultSet.getInt("id_course"),
                        resultSet.getString("nameCourse"),
                        resultSet.getString("description"),
                        resultSet.getString("teacher")

                );
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        MYsqlConfing.closeConnection();
        return course;
    }

    @Override
    public Course readByName(String name){
        Connection connection = MYsqlConfing.OpenConnection();
        Course course = null;
        try{
            //query
            String sqlQuery= "select * from course where namecourse like ?;";

            PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"%"+name+"%");

            preparedStatement.execute(); // ejecuta el query

            ResultSet resultSet= preparedStatement.getResultSet();
            if(resultSet.next()){
                course = new Course(
                        resultSet.getInt("id_course"),
                        resultSet.getString("namecourse"),
                        resultSet.getString("description"),
                        resultSet.getString("teacher")
                );
                preparedStatement.close();
                MYsqlConfing.closeConnection();
                return course;
            }

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

        MYsqlConfing.closeConnection();
        return course;
    }


    @Override
    public void update(Integer id, Course request) {

        Connection connection = MYsqlConfing.OpenConnection();

        try{
            String sqlQUery="update course set namecourse=?,description=?,teacher=? where id_course=?; ";

            //preparedstatement

            PreparedStatement preparedStatement= connection.prepareStatement(sqlQUery);

            //seting

            preparedStatement.setInt(4,id);
            preparedStatement.setString(1,request.getNameCourse());
            preparedStatement.setString(2,request.getDescription());
            preparedStatement.setString(3,request.getTeacher());



            preparedStatement.execute();

            preparedStatement.close();
            MYsqlConfing.closeConnection();

        }catch(SQLException e){
            throw new RuntimeException(e);
        }

    }

}
