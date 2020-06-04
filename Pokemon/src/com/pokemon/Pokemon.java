package com.pokemon;

public class Pokemon {
	private String name;
	private String type;
	private int health;
	
	public static int count;
	
	public void attackPokemon(Pokemon pokemon) {
		int health = pokemon.getHealth();
		pokemon.setHealth(health-10);
	}
	
	public Pokemon(String name, String type, int health) {
		this.name = name;
		this.type = type;
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
