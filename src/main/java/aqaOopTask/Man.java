package aqaOopTask;

public class Man extends Person implements Displayable{

    private String sex;

    public Man(String name, int age, String profession, String sex) {
        super(name, age, profession);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
       return super.toString() +  ", Sex: " + sex;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Profession: " + getProfession()+ ", Sex: " + getSex());
    }
}
