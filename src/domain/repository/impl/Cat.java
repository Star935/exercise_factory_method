package domain.repository.impl;

import domain.repository.Pet;

public class Cat implements Pet {
    @Override
    public void sleep() {
        System.out.println("Duerme bonito y es algo peludo");
    }

    @Override
    public void funny() {
        System.out.println("Aveces algo agresivo, pero bonito en general");
    }
}
