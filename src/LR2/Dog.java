package LR2;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, Integer age, String NumberOfPaws, String breed) {
        super(name, age, NumberOfPaws);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
