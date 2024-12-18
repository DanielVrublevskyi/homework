package aqaOopTask;

public class Lection9_10_Homework {
    public static void main(String[] args) {

        Man John = new Man("John", 30, PersonRole.ENGINEER.getPersoneRoleString(), "Male");
        Woman Mary = new Woman("Mary", 25, PersonRole.TEACHER.getPersoneRoleString(), "Female");
        Man Bob = new Man("Bob", 35, PersonRole.DOCTOR.getPersoneRoleString(), "Male");

        System.out.print("1. ");
        John.displayInformation();
        Mary.displayInformation();
        Bob.displayInformation();
        System.out.println();

        Woman Alice = new Woman("Alice", 28, "Architect", "Female");

        System.out.print("2. ");
        Alice.displayInformation();
        Alice.setProfession("Designer");
        System.out.println("(After profession update)");
        Alice.displayInformation();

        System.out.println();
        System.out.println("Using toString");
        System.out.println("1. " + John);
        System.out.println(Mary);
        System.out.println(Bob);
        System.out.println("2. " + Alice);
    }
}
