package org.example.DZ2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sozdaniya[] sozdaniyas = {
            new Cat("Barsik", 100, 2, "Seam", 3),
            new Human("Ildus", 1000, 3, "Man", 40),
            new Robot("Robo", 5000, 5, "Electric")
        };
        Treadmill distan = new Treadmill(300);
        Wall vysota = new Wall(4);
        for (Sozdaniya sozdaniya: sozdaniyas) {
            sozdaniya.running(distan.distance);
            sozdaniya.jumping(vysota.height);
        }
        Integer[] prepyat = {distan.distance, vysota.height};
        List<String> finish = new ArrayList<>();
        for (int j = 0; j < sozdaniyas.length; j++) {
                if(sozdaniyas[j].run >= prepyat[0] && sozdaniyas[j].jump >= prepyat[1]){
                    finish.add(sozdaniyas[j].name);
                }
        }
        System.out.println("Прошли все препятсвия:" + finish);
    }
}
