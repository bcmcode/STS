package com.dd;

public class Ninja extends Human{
	public Ninja() {
		this.setStealth(10);
	}
	public void steal(Human guy) {
		int health = guy.getHealth();
		int stealth = this.getStealth();
		guy.setHealth(health-stealth);
		int ninjaHealth = this.getHealth();
		this.setHealth(ninjaHealth+stealth);
	}
	public void runAway() {
		int health = this.getHealth();
		this.setHealth(health-10);
	}
}
