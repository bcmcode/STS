package com.zookeeper.part1;

public class Gorilla extends Mammal{
	public void throwSomething() {
		int engy = this.getEnergyLevel();
		this.setEnergyLevel(engy-5);
		System.out.println("Hey that gorilla just threw something!");
	}
	public void eatBananas() {
		int eng = this.getEnergyLevel();
		this.setEnergyLevel(eng + 10);
		System.out.println("nom nom nom");
	}
	public void climb() {
		int eng = this.getEnergyLevel();
		this.setEnergyLevel(eng-10);
		System.out.println("Look, that gorilla is up in a tree!");
	}
}
