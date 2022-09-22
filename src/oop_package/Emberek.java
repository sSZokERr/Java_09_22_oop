package oop_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<ember> emberek;

    public Emberek(ember[] emberTomb){
       this.emberek = new ArrayList<>();
       for (ember e: emberTomb){
           emberek.add(e);
           this.emberek.addAll(Arrays.asList(emberTomb));
       }
    }

}
