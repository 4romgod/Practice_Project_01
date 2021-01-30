package org.practice.project.factory;

import org.junit.Test;
import org.practice.project.entity.Fighter;

import static org.junit.Assert.assertTrue;

public class FighterFactoryTest {

    @Test
    public void testNewFighter_givenValidInput_returnsFighterObject() {
        Fighter fighter = FighterFactory.newFighter("Vasyl", "Lomachenko", 15, 2, 0);
        assertTrue(fighter instanceof Fighter);
    }

}