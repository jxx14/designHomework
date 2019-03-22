package main.model.weapon;

import main.model.role.Item;

public abstract class Weapon extends Item {

	private int addDamage;

	
	public abstract void moreDamage(int damage);


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getAddDamage() {
		return addDamage;
	}


	public void setAddDamage(int addDamage) {
		this.addDamage = addDamage;
	}
	
}
