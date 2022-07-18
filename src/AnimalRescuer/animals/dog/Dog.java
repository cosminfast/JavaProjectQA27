package AnimalRescuer.animals.dog;

import AnimalRescuer.animals.Animal;

public class Dog extends Animal {

    private int fangsLength;

    public int getFangsLength() {
        return fangsLength;
    }

    public void setFengsHeight(int fangsLength) {
        this.fangsLength = fangsLength;
    }

    public void waveTail() {
        System.out.println("waving the tail");
    }

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {

    }

    @Override
    public void speak() {

    }

    @Override
    public void play() {

    }
}
