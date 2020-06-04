package com.dd;

public class Samurai extends Human{
	private static int samurais = 0;
	public Samurai() {
		this.setHealth(200);
		samurais += 1;
	}
	public void deathBlow(Human guy) {
		guy.setHealth(0);
		int health = this.getHealth();
		this.setHealth(health/2);
	}
	public void meditate() {
		this.setHealth(200);
	}
	public static int howMany() {
		return samurais;
	}
}
