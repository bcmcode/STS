package com.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon{
	private ArrayList<Pokemon> myPokemons;
	
	public void listPokemon() {
		for(Pokemon pokemon : myPokemons) {
			System.out.println(pokemon.getName());
		}
	}
}
