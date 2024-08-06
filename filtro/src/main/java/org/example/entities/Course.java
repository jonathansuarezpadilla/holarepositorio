package org.example.entities;

public class Course {

    private int id_course;
    private String nameCourse;

    private String teacher;

    private String description;



    public Course(){

    }

    public Course(int id_course, String nameCourse, String teacher, String description) {
        this.id_course = id_course;
        this.nameCourse = nameCourse;
        this.teacher = teacher;
        this.description = description;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString(){
        return "id: " + this.id_course+
                ", nameCourse: " + this.nameCourse+
                ", teacher: " + this.description+
                ", description: " + this.teacher;

    }
}
