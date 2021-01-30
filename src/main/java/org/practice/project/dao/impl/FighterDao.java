package org.practice.project.dao.impl;

import org.practice.project.dao.IFighterDao;
import org.practice.project.entity.Fighter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FighterDao implements IFighterDao<Fighter> {

    private Set<Fighter> fighterDB;

    public FighterDao(Set<Fighter> fighterDB) {
        this.fighterDB = fighterDB;
    }

    @Override
    public void create(Fighter fighter) {
        this.fighterDB.add(fighter);
    }

    @Override
    public Optional<Fighter> read(String id) {
        return this.fighterDB.stream()
                .filter(fighter -> fighter.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void update(Fighter item) {
        this.fighterDB.remove(read(item.getId()).get());
        this.fighterDB.add(item);
    }

    @Override
    public void remove(String id) {
        Fighter toRemove = this.fighterDB.stream()
                .filter(fighter -> fighter.getId().equalsIgnoreCase(id))
                .findFirst().get();
        this.fighterDB.remove(toRemove);
    }

    @Override
    public List<Fighter> getAll() {
        return new ArrayList<>(this.fighterDB);
    }
}
