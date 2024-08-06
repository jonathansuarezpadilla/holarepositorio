package org.example.entities;

public class Qualification {

    private int id_qualification;
    private int qualificationONe;
    private int qualificationTwo;

    private int qualificationThree;

    public Qualification(){

    }
    public Qualification(int id_qualification, int qualificationONe, int qualificationTwo, int qualificationThree) {
        this.id_qualification = id_qualification;
        this.qualificationONe = qualificationONe;
        this.qualificationTwo = qualificationTwo;
        this.qualificationThree = qualificationThree;
    }

    public int getId_qualification() {
        return id_qualification;
    }

    public void setId_qualification(int id_qualification) {
        this.id_qualification = id_qualification;
    }

    public int getQualificationONe() {
        return qualificationONe;
    }

    public void setQualificationONe(int qualificationONe) {
        this.qualificationONe = qualificationONe;
    }

    public int getQualificationTwo() {
        return qualificationTwo;
    }

    public void setQualificationTwo(int qualificationTwo) {
        this.qualificationTwo = qualificationTwo;
    }

    public int getQualificationThree() {
        return qualificationThree;
    }

    public void setQualificationThree(int qualificationThree) {
        this.qualificationThree = qualificationThree;
    }

    @Override
    public String toString(){
        return "id: " + this.id_qualification +
                ", qualificationONe: " + this.qualificationONe+
                ", qualificationTwo: " + this.qualificationTwo +
                ", qualificationThree: " + this.qualificationThree;

    }
}
