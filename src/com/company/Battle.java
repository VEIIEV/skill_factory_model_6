package com.company;

import java.util.ArrayList;

public class Battle {
    private ArrayList<Monster> monsters=new ArrayList<>();

    public void add(Monster monster){
        if(monsters.size()<5) monsters.add(monster);
        else System.out.println("no more monsters!!!");
    }

    public  void start(){
        run();
    }

    private void run() {
        for (int i = 0; i < monsters.size() ; i++) {
            monsters.get(i).attack();

        }
    }


}
