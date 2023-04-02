package LR2;

public class Fish extends Animal {
    private String CarnivoreHerbivore;

    public Fish(String name, Integer age, String NumberOfPaws, String CarnivoreHerbivore) {
        super(name, age, NumberOfPaws);
        this.CarnivoreHerbivore = CarnivoreHerbivore;
    }

    public void setCarnivoreHerbivore(String breed) {
        this.CarnivoreHerbivore = breed;
    }

    public String getCarnivoreHerbivore() {
        return CarnivoreHerbivore;
    }
}
