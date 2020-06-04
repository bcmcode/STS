package com.zookeeper.part1;

public class Bat extends Mammal{
	public Bat() {
		this.setEnergyLevel(300);
	}
	public void fly() {
		int eng = this.getEnergyLevel();
		this.setEnergyLevel(eng-50);
		System.out.println("Woosh");
	}
	public void eatHumans() {
		int eng = this.getEnergyLevel();
		this.setEnergyLevel(eng+25);
		System.out.println("Nom Nom Nom");
	}
	public void attackTown() {
		int eng = this.getEnergyLevel();
		this.setEnergyLevel(eng-100);
		System.out.println("ahhhh! the town is on fire!");
	}
}
