package aqaOopTask;

public class Woman extends Person implements Displayable{

    private static String sex;

    public Woman(String name, int age, String profession, String sex) {
        super(name, age, profession);
        Woman.sex = sex;
    }

    public static String getSex() {
        return sex;
    }

    public static void setSex(String sex) {
        Woman.sex = sex;
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
