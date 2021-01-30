package org.practice.project.factory;

import org.practice.project.entity.Fighter;

import java.util.UUID;

public class FighterFactory {

    public static Fighter newFighter(String firstName, String lastName, int wins, int losses, int draws) {
        return new Fighter(UUID.randomUUID().toString(), firstName, lastName, wins, losses, draws);
    }

}
