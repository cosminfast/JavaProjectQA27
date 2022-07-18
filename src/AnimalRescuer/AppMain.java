package AnimalRescuer;

import AnimalRescuer.animals.Duck;
import AnimalRescuer.animals.Mouse;
import AnimalRescuer.animals.dog.Dog;
import AnimalRescuer.animals.dog.Labrador;
import AnimalRescuer.animals.Siamese;

public class AppMain {

    public static void main(String[] args) {
//        Dog ralph = new Dog();
//        System.out.println(ralph.getName());
//        ralph.setName("asda");
//        ralph.play();
//
//        Dog rex = new Dog();
//        rex.setName("Rex");
//
//        System.out.println(rex.getName());
//        rex.play();
//
//
//        Dog grivey = new Dog();
//        grivey.setName("Grivey");
//        grivey.eat();
//
//        Duck ducky = new Duck();
//        ducky.setName("Ducky");
//
//        ducky.sleep();
//
//        Labrador duffy = new Labrador();
//        ducky.speak();
//
//        Siamese toby = new Siamese();
//        toby.speak();

        Siamese tobby  = new Siamese();
        tobby.eat();

        Mouse mousee = new Mouse();
        mousee.play();

        Labrador doru = new Labrador();
        doru.sleep();

    }
}
