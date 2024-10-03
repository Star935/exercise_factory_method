package domain.repository.extens;

import domain.repository.Pet;
import domain.repository.PetFactory;
import domain.repository.impl.Dog;

public class DogFactory extends PetFactory {
    @Override
    public Pet createPet() {
        return new Dog();
    }
}
