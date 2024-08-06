package org.example.Persistence.Crud;

public interface  ReadModel <ID,entity>{

    public entity readById(ID id);
}
