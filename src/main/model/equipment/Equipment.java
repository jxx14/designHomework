package main.model.equipment;


import main.model.role.Item;

public abstract class Equipment extends Item {
	private String name;
	private int level;
	private int addDefense;
	
	public abstract void moreDefense(int defense);

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

	public int getAddDefense() {
		return addDefense;
	}

	public void setAddDefense(int addDefense) {
		this.addDefense = addDefense;
	}

}
