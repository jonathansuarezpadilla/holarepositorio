package org.example.entities;

public class Inscription {

    private int id_inscription;
    private int id_student;

    private int id_course;


    public Inscription(){

    }

    public Inscription(int id_inscription, int id_student, int id_course) {
        this.id_inscription = id_inscription;
        this.id_student = id_student;
        this.id_course = id_course;
    }


    public int getId_inscription() {
        return id_inscription;
    }

    public void setId_inscription(int id_inscription) {
        this.id_inscription = id_inscription;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    @Override
    public String toString(){
        return "id: " + this.id_inscription +
                ", id_student " + +this.id_student+
                ", id_course: " + this.id_course;

    }
}
