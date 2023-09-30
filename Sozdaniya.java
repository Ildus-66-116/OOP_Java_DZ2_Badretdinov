package org.example.DZ2;

public abstract class Sozdaniya {
    String name;
    int run;
    int jump;

    public Sozdaniya(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    abstract void running(int runDistance);
    abstract void jumping(int jumpHeight);
}
