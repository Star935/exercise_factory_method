package domain.repository.extens;

import domain.repository.Pet;
import domain.repository.PetFactory;
import domain.repository.impl.Cat;

public class CatFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Cat();
    }
}
