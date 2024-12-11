
public class Predator extends  AbstractAnimal{
    public Predator(String breed, String name, double cost, String character){
        super(breed, name, cost, character);
    }
    @Override
    public String toString() {
        return "Predator{" + "Breed='" + breed + '\'' + ", Name='" + name + '\'' + ", Cost=" + cost + ", Character='" + character + '\'' + '}';
    }
}
