package it.develhope.exercise10;

public class Cow extends Animal{

    public Cow(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("The right sound of the cow is : 'MUUUUUU'");
    }
}
