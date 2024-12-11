
public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер

    public AbstractAnimal(String breed, String name, double cost, String character) {
        this.breed = breed;
        this.name=name;
        this.cost=cost;
        this.character=character;
        //System.out.println("Порода: "+breed+", Имя: "+name+", Цена в магазине: "+cost+", Характер: "+character);
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}
