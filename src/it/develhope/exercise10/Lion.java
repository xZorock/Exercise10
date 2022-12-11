package it.develhope.exercise10;

public class Lion extends Animal{

    public Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void animalSound() {
        System.out.println("The right sound of the cow is : 'ROARRRRR'");

    }
}
