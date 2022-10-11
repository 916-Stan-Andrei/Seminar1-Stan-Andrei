package repository;

import exceptions.Exceptions;
import model.Entity;

import java.util.List;

public interface IRepository {

    void add(Entity entity) throws Exceptions;

    void remove(Entity entity);

    Entity[] getAll();

    List<Entity> getAllWithWeightGreaterThan() ;
}
