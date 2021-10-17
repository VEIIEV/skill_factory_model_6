package com.company;

public abstract class Monster {

    final private String name;
    private int damage;


    public Monster(String name, int damage){
        this.name=name;
        this.damage=damage;
        System.out.println("Monster "+ name +" was created");
    }

    public Monster(Monster bob) {
        name= bob.name;
        damage=bob.damage;
    }

    public void growl(){}

    public void attack(){
        System.out.println("Monster " +name + " attacked with damage "+damage);
        growl();
        System.out.println(" "+ name+" growled");
    }

}
