package org.example.entities;

public class Student {


    private int id_student;
    private String name;
    private String email;
    private int int_qualification;
    private String status;

    public Student(){

    }
    public Student(int id_student, String name, String email, int int_qualification, String status) {
        this.id_student = id_student;
        this.name = name;
        this.email = email;
        this.int_qualification = int_qualification;
        this.status = status;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInt_qualification() {
        return int_qualification;
    }

    public void setInt_qualification(int int_qualification) {
        this.int_qualification = int_qualification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "id: " + this.id_student +
                ", name: " + this.name +
                ", email: " + this.email +
                ", int_qualification: " + this.int_qualification +
                ", status: "+ this.status;
    }
}
