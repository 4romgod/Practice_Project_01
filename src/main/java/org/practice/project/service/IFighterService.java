package org.practice.project.service;

import java.util.List;

public interface IFighterService<T> {

    void create(T item);

    T read(String id);

    void update(T item);

    void remove(String id);

    List<T> readAll();

}
