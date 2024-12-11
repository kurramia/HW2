import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CreateAnimalService {
    protected Set<String> uniqueNames = new HashSet<>();
    protected Random random = new Random();

    protected String[] breeds = {"Dog", "Cat", "Wolf", "Lion"};
    protected String[] characters = {"Friendly", "Curious", "Aggressive", "Calm"};

    public void createAnimals() {
        while (uniqueNames.size() < 10) {
            String name = "Animal" + random.nextInt(100);
            if (uniqueNames.add(name)) {
                Animal animal = createAnimal(name);
                System.out.println(animal);
            }
        }
    }

    protected Animal createAnimal(String name) {
        String breed = breeds[random.nextInt(breeds.length)];
        double price = 50 + (200 - 50) * random.nextDouble();
        String character = characters[random.nextInt(characters.length)];

        return random.nextBoolean() ? new Pet(breed, name, price, character) : new Predator(breed, name, price, character);
    }

}
