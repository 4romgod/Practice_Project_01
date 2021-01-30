package org.practice.project.entity;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static org.practice.project.utils.ValidationUtils.validate;

@Getter
@ToString
public class Fighter {

    @NotNull(message = "id cannot be null")
    private final String id;

    @NotNull(message = "first name cannot be null")
    private final String firstName;

    @NotNull(message = "last name cannot be null")
    private final String lastName;

    @Min(value = 0, message = "wins cannot be less than zero")
    private final int wins;

    @Min(value = 0, message = "wins cannot be less than zero")
    private final int losses;

    @Min(value = 0, message = "wins cannot be less than zero")
    private final int draws;

    public Fighter(String id, String firstName, String lastName, int wins, int losses, int draws) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        validate(this);
    }

}
