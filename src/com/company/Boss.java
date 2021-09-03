package com.company;

public class Boss extends Player {

    private int speed;

    public Boss(int health, int attack, int speed) {
        super(health, attack);
        this.speed = speed;
    }

    public void attack(){
        System.out.println("Boss attacked everyone");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
