package main.model.role;

import main.model.equipment.Equipment;
import main.model.skill.Skill;
import main.model.weapon.Weapon;

import java.util.List;


public abstract class Character extends Role{

	private int level;
	private int xp;
	private Weapon weapon;
	private Equipment equipment;
	private List<Skill> skills;
	private int[] levelXps; //表驱动

	
	public abstract void levelUp(int xp, int currentLevel);
	public abstract int getLevelFromXp(int xp);
	public abstract int collectWeapon();
	public abstract int collectEquipment();
	public abstract int collectSkills();

	public abstract void removeWeapon(Weapon w);
	public abstract void removeEquipment(Equipment e);
	
	public Character(String name){
		super(name);
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}

	
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public int[] getLevelXps() {
		return levelXps;
	}
	public void setLevelXps(int[] levelXps2) {
		this.levelXps = levelXps2;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	
	
	

}
