package com.company;

public class Main {

    public static void main(String[] args) {

    	Boss boss = new Boss(500, 50, 4);
		System.out.println("Boss health: " + boss.getHeal() + " Boss damage: " + boss.getAttack() + " Boss speed: " + boss.getSpeed());
		boss.attack();

    	Warrior warrior = new Warrior(350, 30,"Makima");
		System.out.println("Warrior name: " + warrior.getName() + " Warrior health: " + warrior.getHeal() + " Warrior attack " + warrior.getAttack());
		warrior.attack();

    	Magical magical = new Magical(300, 40,"Aki");
		System.out.println("Magical name: " + warrior.getName() + " Magical health: " + magical.getHeal() + " Magical attack " + magical.getAttack());
		magical.protection();

    	Mental mental= new Mental(250,35,"vanishing");
		System.out.println("Mental health: " + mental.getHeal() + " Mental attack " + mental.getAttack() + " Mental ability: " + mental.getAbility());
		mental.attackBoss();



    }
}
