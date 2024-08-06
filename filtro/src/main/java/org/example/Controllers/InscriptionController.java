package org.example.Controllers;

import org.example.Model.InscripcionModelImp;
import org.example.Persistence.imodel.iInscriptionModel;
import org.example.entities.Inscription;

public class InscriptionController {

    iInscriptionModel  inscriptionModel= new InscripcionModelImp();


    public Inscription create(Inscription request){
        return this.inscriptionModel.create(request);
    }

    public Inscription readById(int id){
        return this.inscriptionModel.readById(id);
    }

    public void update(int id, Inscription request){
        this.inscriptionModel.update(id,request);
    }

}
