package org.example.Persistence.imodel;

import org.example.Persistence.Crud.CreateModel;
import org.example.Persistence.Crud.ReadModel;
import org.example.Persistence.Crud.UpdateModel;
import org.example.entities.Inscription;

public interface iInscriptionModel extends
        CreateModel<Inscription>, ReadModel<Integer,Inscription>,
        UpdateModel<Integer,Inscription> {
}
