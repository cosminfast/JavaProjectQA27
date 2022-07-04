package AnimalRescuer;

import AnimalRescuer.animals.dog.Dog;
import AnimalRescuer.animals.Duck;

public class AppMain {

    public static void main(String[] args) {
        Dog ralph = new Dog();
        System.out.println(ralph.getName());
        ralph.setName("asda");
        ralph.play();

        Dog rex = new Dog();
        rex.setName("Rex");

        System.out.println(rex.getName());
        rex.play();


        Dog grivey = new Dog();
        grivey.setName("Grivey");
        grivey.eat();

        Duck ducky = new Duck();
        ducky.setName("Ducky");

        ducky.sleep();
    }
}
