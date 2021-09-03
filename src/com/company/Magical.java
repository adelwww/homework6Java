package com.company;

public class Magical extends Player {

    private String name;

    public Magical(int health, int attack, String name) {
        super(health, attack);
        this.name = name;
    }
    public void protection(){
        System.out.println("Magical repelled the attack");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
