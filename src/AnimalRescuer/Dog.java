package AnimalRescuer;

public class Dog {

    private int age;
    private String race ;
    private String name ;
    private String color ;
    private double weight ;
    private int heightCm ;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public void eat(){
        System.out.println("eating dog food");
    }

    public void sleep(){
        System.out.println("Snores..zzzz");
    }

    public void speak(){
        System.out.println("Ham!");
    }

    public void play(){
        System.out.println("Playing fetch");
    }

    public void waveTail(){
        System.out.println("waving the tail");
    }
}
