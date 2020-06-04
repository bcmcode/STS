package com.dd;

public class Human {
	private int strength;
	private int stealth;
	private int intelligencs;
	private int health;
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligencs = 3;
		this.health = 100;
	}
	
	public void attack(Human enemy) {
		enemy.health -= this.strength;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligencs() {
		return intelligencs;
	}
	public void setIntelligencs(int intelligencs) {
		this.intelligencs = intelligencs;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
