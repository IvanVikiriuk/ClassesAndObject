package app;

public class Person {
    private final String name;
    private final int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "Name: " + name + ",Age: " + age +
                ",Profession: " + profession);
    }
}