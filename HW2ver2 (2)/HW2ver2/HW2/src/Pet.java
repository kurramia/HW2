
public class Pet extends AbstractAnimal {

    public Pet(String breed, String name, double cost, String character){
        super(breed, name, cost, character);
    }
    @Override
    public String toString() {
        return "Pet{" + "Breed='" + breed + '\'' + ", Name='" + name + '\'' + ", Cost=" + cost + ", Character='" + character + '\'' + '}';
    }
}
