import java.util.Vector;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public abstract boolean canWalk();

    public abstract boolean canSwim();
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}

class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    public boolean canWalk() {
        return true;
    }

    public boolean canSwim() {
        return true;
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

   public boolean canWalk() {
        return true;
    }

   public boolean canSwim() {
        return false;
    }
}


class FarmManagement {
    private Vector<Animal> animals;
    public FarmManagement() {
        animals  = new Vector<Animal>();
    }

    public void addAnimalToFarm(Animal animal) {
        Animal a = animal;
        animals.add(a);
    }

    public void printAnimalsCanWalk() {
        for (Animal a: animals) {
            if (a.canWalk())
            System.out.println(a.getName());
        }
    }

    public void printAnimalsCanSwim() {
        for (Animal a: animals) {
            if (a.canSwim()) {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) {
        FarmManagement fm = new FarmManagement();
        fm.addAnimalToFarm(new Pig("lon"));
        fm.addAnimalToFarm(new Duck("vit"));
        fm.addAnimalToFarm(new Fish("ca"));
        fm.printAnimalsCanWalk();
        fm.printAnimalsCanSwim();
    }
}


