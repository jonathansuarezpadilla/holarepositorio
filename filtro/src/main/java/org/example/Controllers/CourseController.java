package org.example.Controllers;

import org.example.Model.CourseModelImp;
import org.example.Persistence.imodel.iCourseModel;
import org.example.entities.Course;
import org.example.entities.Qualification;

public class CourseController {


    iCourseModel  courseModel= new CourseModelImp();


    public Course create(Course request){
        return this.courseModel.create(request);
    }


    public Course readById(int id){
        return this.courseModel.readById(id);
    }

    public Course readByName(String name){
        return this.courseModel.readByName(name);
    }

    public void update(int id, Course request){
        this.courseModel.update(id,request);
    }
}
