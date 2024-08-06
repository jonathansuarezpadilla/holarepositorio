package org.example.Controllers;

import org.example.Model.StudentModelImp;
import org.example.Persistence.imodel.iStudentModel;
import org.example.entities.Student;

public class StudentController {



    iStudentModel studentModel= new StudentModelImp();



    public Student create(Student request) {
        return this.studentModel.create(request);
    }


    public Student readById(int id){
        return this.studentModel.readById(id);
    }


    public  Student readByName(String name){
        return this.studentModel.readByName(name);
    }


    public void update(int id, Student request){
        this.studentModel.update(id,request);
    }


    public  void delete(int id){
        this.studentModel.delete(id);
    }
}
