package org.example.Persistence.imodel;

import org.example.Persistence.Crud.CreateModel;
import org.example.Persistence.Crud.ReadModel;
import org.example.Persistence.Crud.UpdateModel;
import org.example.entities.Qualification;

public interface iQualificationModel extends
        CreateModel<Qualification>, ReadModel<Integer,Qualification>,
        UpdateModel<Integer,Qualification> {

}
