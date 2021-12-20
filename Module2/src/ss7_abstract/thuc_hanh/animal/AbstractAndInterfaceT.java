package ss7_abstract.thuc_hanh.animal;

import ss7_abstract.thuc_hanh.fruit.Apple;
import ss7_abstract.thuc_hanh.fruit.Fruit;
import ss7_abstract.thuc_hanh.fruit.Orange;

public class AbstractAndInterfaceT {
    public static void main(String[] args){
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) System.out.println(fruit.howToEat());


    }
}
