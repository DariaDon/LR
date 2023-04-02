package LR2;

public class Animal {
    private String name, NumberOfPaws;
    private Integer age;

    public Animal(String name, Integer age, String NumberOfPaws) {
        this.name = name;
        this.age = age;
        this.NumberOfPaws = NumberOfPaws;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setNumberOfPaws(String color) {
        this.NumberOfPaws = NumberOfPaws;
    }

    public String getNumberOfPaws() {
        return NumberOfPaws;
    }
}
