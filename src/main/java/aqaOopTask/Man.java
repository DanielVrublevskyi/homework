package aqaOopTask;

public class Man extends Person implements Displayable{

    private static final String sex = "Male";

    public Man(String name, int age, String profession) {
        super(name, age, profession);
    }

    public String getSex() {
        return sex;
    }


    @Override
    public String toString() {
       return super.toString() +  ", Sex: " + sex;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Profession: " + getProfession()+ ", Sex: " + getSex());
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " goes to the gym");
    }
}
