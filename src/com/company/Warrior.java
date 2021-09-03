package com.company;

public class Warrior extends Player {

    private String name;


    public Warrior(int health, int attack, String name) {
        super(health, attack);
        this.name = name;
    }

    public void attack(){
        System.out.println("Warrior attacked in response");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
