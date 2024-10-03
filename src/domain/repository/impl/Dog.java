package domain.repository.impl;

import domain.repository.Pet;

public class Dog implements Pet {

    @Override
    public void sleep() {
        System.out.println("Duerme bonito y ronca");
    }

    @Override
    public void funny() {
        System.out.println("Es divertido y bonito");
    }
}
