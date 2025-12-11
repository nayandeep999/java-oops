package com.kodewala.inheritance;

class Player extends HealthBarLogic {
	Player() {
		setHealth(100);
		System.out.println("The health of player is: " + getHealth());
	}
}

class NPC extends HealthBarLogic {
	NPC() {
		setHealth(1000);
		System.out.println("The health of player is: " + getHealth());
	}
}

public class HealthBarLogic {

	private int health;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public static void main(String[] args) {

		Player p = new Player();
		NPC npc = new NPC();

	}

}
