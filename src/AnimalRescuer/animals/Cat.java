package AnimalRescuer.animals;

import AnimalRescuer.animals.Animal;

public abstract class Cat extends Animal {


    @Override
    public void eat() {
        System.out.println("eating purrina");
    }

    @Override
    public void sleep() {

    }

    public void speak(){
        System.out.println("miau");
    }

    @Override
    public void play() {

    }
}
