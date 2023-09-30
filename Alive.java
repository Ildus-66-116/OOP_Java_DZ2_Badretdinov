package org.example.DZ2;

public class Alive extends Sozdaniya{
    String view;

    public Alive(String name, int run, int jump, String view) {
        super(name, run, jump);
        this.view = view;
    }


    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " пробежал " + runDistance + " метров.");
        }else {
            System.out.println(name + " не добежал, только " + run + " метров.");
        }

    }

    @Override
    void jumping(int jumpHeight) {
        if (jumpHeight < jump) {
            System.out.println(name + " прыгнул " + jumpHeight + " метров.");
        }else {
            System.out.println(name + " не смог перепрыгнуть " + jump + " метров.");
        }
    }
}
