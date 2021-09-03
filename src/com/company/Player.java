package com.company;

public class Player {

    private int health;
    private int attack;

    public Player(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public int getHeal() {
        return health;
    }

    public void setHeal(int heal) {
        this.health = heal;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
