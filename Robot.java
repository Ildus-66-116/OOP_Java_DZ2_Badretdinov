package org.example.DZ2;

public class Robot extends Sozdaniya{
    String view;

    public Robot(String name, int run, int jump, String view) {
        super(name, run, jump);
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
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
            System.out.println(name + " перепрыгнул " + jumpHeight + " метра.");
        }else {
            System.out.println(name + " не смог перепрыгнуть " + jump + " метра.");
        }
    }
}
