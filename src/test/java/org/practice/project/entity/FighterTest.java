package org.practice.project.entity;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FighterTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_givenValidInput_returnsFighterObject() {
        Fighter fighter = new Fighter(null, "Vasyl", "Lomachenko", -1, 2, 0);
        assertNotNull(fighter);
        assertTrue(fighter instanceof Fighter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_givenInvalidInput_throwsIllegalArgumentException() {
        Fighter fighter = new Fighter(null, "Vasyl", "Lomachenko", -1, 2, 0);
    }

}