package org.example.DZ2;

public class Cat extends Alive{
    Integer age;

    public Cat(String name, int run, int jump, String view, Integer age) {
        super(name, run, jump, view);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
