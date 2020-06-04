package com.dd;

public class HumanTest {

	public static void main(String[] args) {
		Human frank = new Human();
		Human al = new Human();
		frank.attack(al);
		System.out.println("frank has health "+frank.getHealth()+" al has health "+al.getHealth());
	}

}
