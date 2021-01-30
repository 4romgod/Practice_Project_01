package org.practice.project.dao;

import java.util.List;
import java.util.Optional;

public interface IFighterDao<T> {

    void create(T fighter);

    Optional<T> read(String id);

    void update(T item);

    void remove(String id);

    List<T> getAll();

}
