package aqaOopTask;

public abstract class Person implements Displayable {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        try {
            setName(name);
        } catch (CustomException e) {
            e.printStackTrace();
        }
        try {
            setAge(age);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        this.profession = profession;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException(getName() + "'s Age should be 0 or higher");
        }
        this.age = age;
    }

    public void setName(String name) throws CustomException {
        if (name == null || name.isEmpty()) {
            throw new CustomException("Name can't be null or empty");
        }
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
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
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Profession: " + getProfession() + ", Sex: " + Woman.getSex());
        System.out.println("Salary: " + salary);
    }

    @Override
    public void displayInformation(String city) {
        System.out.println(getName() + " lives in " + city);
    }

    public abstract void walk();

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Profession: " + profession;
    }
}
