package org.example.Persistence.Crud;

public interface UpdateModel<ID,entity> {
    public void update(ID id,entity thing);
}
