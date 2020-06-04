package com.dd;

public class DDTest {

	public static void main(String[] args) {
		Wizard bill = new Wizard();
		Ninja tom = new Ninja();
		Samurai marge = new Samurai();
		Samurai frank = new Samurai();
		
		bill.fireball(tom);
		tom.steal(marge);
		marge.deathBlow(tom);
		bill.heal(tom);
		tom.steal(marge);
		
		System.out.println("Bill: "+bill.getHealth());
		System.out.println("Tom: "+tom.getHealth());
		System.out.println("Marge: "+marge.getHealth());
		System.out.println(Samurai.howMany()+" samurai");
	}

}
