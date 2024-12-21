package aqaOopTask;

public abstract class Person implements Displayable{
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
    public void displayInformation(int salary) {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Profession: " + getProfession()+ ", Sex: " + Woman.getSex());
        System.out.println("Salary: " + salary);
    }

    @Override
    public void displayInformation(String city) {
        System.out.println(getName() + " lives in " + city);
    }

    public abstract void walk();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age +", Profession: " + profession;
    }
}
