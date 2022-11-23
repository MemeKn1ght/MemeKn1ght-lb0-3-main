package org.lab3.controller;

import org.lab3.models.university.Human;

public interface HumanCreator {
    default Human create(Human.Gender gender, String name, String lastName){
        Human human = new Human();
        human.setGender(gender);
        human.setName(name);
        human.setLastName(lastName);
        return human;
    }
}
