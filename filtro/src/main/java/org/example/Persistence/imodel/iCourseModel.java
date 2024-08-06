package org.example.Persistence.imodel;

import org.example.Persistence.Crud.CreateModel;
import org.example.Persistence.Crud.ReadModel;
import org.example.Persistence.Crud.ReadModelName;
import org.example.Persistence.Crud.UpdateModel;
import org.example.entities.Course;

public interface iCourseModel extends
        CreateModel<Course>, ReadModel<Integer,Course>,
        ReadModelName<String,Course>, UpdateModel<Integer,Course> {

}
