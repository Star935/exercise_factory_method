import domain.repository.Pet;
import domain.repository.PetFactory;
import domain.repository.extens.CatFactory;
import domain.repository.extens.DogFactory;

public class Main {
    public static void main(String[] args) {
        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet();
        dog.sleep();
        dog.funny();

        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet();
        cat.sleep();
        cat.funny();
    }
}