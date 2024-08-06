package org.example.Persistence.imodel;

import org.example.Persistence.Crud.*;
import org.example.entities.Student;

public interface iStudentModel extends
        CreateModel<Student>,
        ReadModel<Integer,Student>,
        ReadModelName<String,Student>, UpdateModel<Integer,Student>, DeleteModel<Integer> {
}
