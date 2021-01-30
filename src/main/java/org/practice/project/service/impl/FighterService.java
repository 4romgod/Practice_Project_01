package org.practice.project.service.impl;

import org.practice.project.dao.IFighterDao;
import org.practice.project.entity.Fighter;

import java.util.List;
import java.util.Optional;

public class FighterService implements IFighterDao<Fighter> {

    @Override
    public void create(Fighter fighter) {

    }

    @Override
    public Optional<Fighter> read(String id) {
        return Optional.empty();
    }

    @Override
    public void update(Fighter item) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public List<Fighter> getAll() {
        return null;
    }

}
