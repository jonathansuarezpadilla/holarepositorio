package org.example;

import org.example.Controllers.CourseController;
import org.example.Controllers.InscriptionController;
import org.example.Controllers.QualificationController;
import org.example.Controllers.StudentController;
import org.example.entities.Course;
import org.example.entities.Inscription;
import org.example.entities.Qualification;
import org.example.entities.Student;
import org.example.utils.StatusStudent;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        //Student



        //create

        /*
        StudentController studentController= new StudentController();

        Student student= new Student();

        student.setName("jonathan");
        student.setEmail("suarezpadillajonathan@gmail.com");
        student.setInt_qualification(1);

        studentController.create(student);

        */

        /*
        //readById(ReadModel)

        StudentController studentController= new StudentController();

        JOptionPane.showMessageDialog(null,studentController.readById(1).toString());



        //readbyname

         //readByName

        StudentController studentController= new StudentController();
        JOptionPane.showMessageDialog(null,studentController.readByName("jonathan").toString());




        // update student
        StudentController studentController= new StudentController();


        Student student= new Student();
        student.setEmail("josuarezp@unal.edu.co");
        student.setName("roberto");
        student.setInt_qualification(2);
        student.setStatus("deactive");
        studentController.update(1,student);
        System.out.println("\n" +
                "update done");

        */

        // delete

        StudentController studentController= new StudentController();

        studentController.delete(1);




        //qualification


        //create

        /*

        QualificationController qualificationController= new QualificationController();

        Qualification qualification= new Qualification();

        qualification.setQualificationONe(20);
        qualification.setQualificationTwo(100);
        qualification.setQualificationThree(45);
        qualificationController.create(qualification);


        //readById
        QualificationController qualificationController= new QualificationController();
        JOptionPane.showMessageDialog(null,qualificationController.readById(1).toString());


        // update


        QualificationController qualificationController= new QualificationController();

        Qualification qualification= new Qualification();
        qualification.setQualificationONe(40);
        qualification.setQualificationTwo(100);
        qualification.setQualificationThree(100);
        qualificationController.update(2,qualification);
        */





        // course

        /*
        // create

        CourseController courseController= new CourseController();


        Course course  = new Course();

        course.setNameCourse("calculo diferencial");
        course.setDescription("materia de 4 creditos");
        course.setTeacher("Norman");


        courseController.create(course);


         //readById(id)

        CourseController courseController= new CourseController();
        JOptionPane.showMessageDialog(null,courseController.readById(1).toString());


        //readByName
        CourseController courseController= new CourseController();
        JOptionPane.showMessageDialog(null,courseController.readByName("calculo").toString());

        //update

        CourseController courseController= new CourseController();

        Course course  = new Course();
        course.setNameCourse("dialectica");
        course.setDescription("introducción al pensamiento critico y racional");
        course.setTeacher("godoi");

        courseController.update(1,course);


        */




        // inscription

        /*
        //create
        InscriptionController inscriptionController= new InscriptionController();

        Inscription inscription= new Inscription();


        inscription.setId_student(1);
        inscription.setId_course(1);

        inscriptionController.create(inscription);

        //readById

        InscriptionController inscriptionController= new InscriptionController();
        JOptionPane.showMessageDialog(null,inscriptionController.readById(1).toString());

         InscriptionController inscriptionController= new InscriptionController();
        Inscription inscription= new Inscription();

        inscription.setId_student(2);
        inscription.setId_course(1);

        inscriptionController.update(1,inscription);
        */



    }

}