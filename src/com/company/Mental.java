package com.company;

public class Mental extends Player {

    private String ability;

    public Mental(int health, int attack, String ability) {
        super(health, attack);
        this.ability = ability;
    }

    public void attackBoss(){
        System.out.println("The attack did not reach Mental");
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}
