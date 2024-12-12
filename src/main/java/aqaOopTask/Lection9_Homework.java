package aqaOopTask;

public class Lection9_Homework {
    public static void main(String[] args) {

        Person John = new Person("John", 30, "Engineer");
        Person Mary = new Person("Mary", 25, "Teacher");
        Person Bob = new Person("Bob", 35, "Doctor");

        System.out.println("Name: " + John.getName() + ", Age: " + John.getAge() + ", Profession: " + John.getProfession());
        System.out.println("Name: " + Mary.getName() + ", Age: " + Mary.getAge() + ", Profession: " + Mary.getProfession());
        System.out.println("Name: " + Bob.getName() + ", Age: " + Bob.getAge() + ", Profession: " + Bob.getProfession());

        Person Alice = new Person("Alice", 28, "Architect");
        System.out.println("Name: " + Alice.getName() + ", Age: " + Alice.getAge() + ", Profession: " + Alice.getProfession());
        Alice.setProfession("Designer");
        System.out.println("Name: " + Alice.getName() + ", Age: " + Alice.getAge() + ", Profession: " + Alice.getProfession());

        System.out.println("Using toString");
        System.out.println(John);
        System.out.println(Mary);
        System.out.println(Bob);
        System.out.println(Alice);
    }
}
