package com.dd;

public class Wizard extends Human{
	public Wizard() {
		this.setHealth(50);
		this.setIntelligencs(8);
	}
	public void heal(Human guy) {
		int health = guy.getHealth();
		guy.setHealth(health+this.getIntelligencs());
	}
	public void fireball(Human guy) {
		int health = guy.getHealth();
		int damage = 3*this.getIntelligencs();
		guy.setHealth(health-damage);
	}
}
