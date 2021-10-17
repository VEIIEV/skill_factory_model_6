package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
// write your code here
  //  Zombie zombie = new Zombie("Bob");
  //  zombie.attack();
  //  System.out.println();
  //  String lil="sd";


        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();

    }

}
