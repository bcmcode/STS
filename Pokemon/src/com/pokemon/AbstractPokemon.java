package com.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	public Pokemon createPokemon(String name, String type, int health) {
		Pokemon pokemon = new Pokemon(name, type, health);
		return pokemon;
	}
	public String pokemonInfo(Pokemon pokemon) {
		String info = "Name: "+pokemon.getName()+" Health: "+pokemon.getHealth()+" Type: "+pokemon.getType();
		return info;
	}
}
