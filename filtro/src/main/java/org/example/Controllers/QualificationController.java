package org.example.Controllers;

import org.example.Model.QualificationModelImp;
import org.example.Persistence.imodel.iQualificationModel;
import org.example.entities.Qualification;

public class QualificationController {


    iQualificationModel qualificationModel= new QualificationModelImp();



    public Qualification create(Qualification request){
        return this.qualificationModel.create(request);
    }

    public  Qualification readById(int id){
        return this.qualificationModel.readById(id);
    }


    public void update(int id,Qualification request){
        this.qualificationModel.update(id,request);
    }

}

