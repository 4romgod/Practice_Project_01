package org.practice.project.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.practice.project.entity.Fighter;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FighterDaoTest {

    private FighterDao fighterDao;
    private Set<Fighter> fighterDB;

    @Before
    public void setUp() {
        this.fighterDB = new HashSet<>();
        this.fighterDB.add(new Fighter("f1", "Vasyl", "Lomachenko", 15, 2, 0));
        this.fighterDB.add(new Fighter("f2", "Errol", "Spence", 27, 0, 0));
        this.fighterDB.add(new Fighter("f3", "Floyd", "Mayweather", 50, 0, 0));
        this.fighterDao = new FighterDao(this.fighterDB);
    }

    @Test
    public void testCreate_givenValidInput_savesItemToStorage() {
        Fighter fighter = new Fighter("some id", "Ali", "Lomachenko", 15, 2, 0);
        this.fighterDao.create(fighter);

        int expected = 4;
        int result = this.fighterDao.getAll().size();
        assertEquals(expected, result);
    }

    @Test
    public void testRead_givenValidInput_returnsAnOptionalFighterObject() {
        assertEquals("Vasyl", this.fighterDao.read("f1").get().getFirstName());
    }

    @Test
    public void testRead_givenNonExistingId_returnsNull() {
        assertFalse(this.fighterDao.read("some non existing id").isPresent());
    }

    @Test
    public void testUpdate_givenValidInput_modifiesItemInStorage() {
        Fighter update = new Fighter("f1", "Matrix", "Lomachenko", 15, 2, 0);
        this.fighterDao.update(update);
        assertEquals("Matrix", this.fighterDao.read("f1").get().getFirstName());
    }

    @Test
    public void testRemove_givenValidIdInput_removesItemFromStorage() {
        this.fighterDao.remove("f1");
        assertFalse(this.fighterDao.read("f1").isPresent());
    }

    @Test
    public void testGetAll_returnsAllItemsFromStorage() {
        int expected = 3;
        int result = this.fighterDao.getAll().size();
        assertEquals(expected, result);
    }

}