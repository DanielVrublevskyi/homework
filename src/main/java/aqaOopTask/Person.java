package aqaOopTask;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setProfession(String profession){
        this.profession = profession;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age +", Profession: " + profession;
    }
}
