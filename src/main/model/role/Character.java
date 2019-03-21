package main.model.role;

import main.model.equipment.Equipment;
import main.model.weapon.Weapon;

import java.util.List;


public abstract class Character {
	private String name;
	private int level;
	private int hp;
	private int defense;
	private int attack;
	private Coordinate coordinate;
	private int xp;
	private String direction;
	private List<Weapon> weapons;
	private List<Equipment> equipments;
	private int[] levelXps; //±íÇý¶¯
	
	public abstract void levelUp(int xp, int currentLevel);
	public abstract int getLevelFromXp(int xp);
	public abstract int collectWeapon();
	public abstract int collectEquipment();
	public abstract void move(String direction);
	public abstract void addWeapon(Weapon w);
	public abstract void removeWeapon(Weapon w);
	public abstract void addEquipment(Equipment e);
	public abstract void removeEquipment(Equipment e);
	
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
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public Coordinate getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	public List<Weapon> getWeapons() {
		return weapons;
	}
	public void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}
	public List<Equipment> getEquipments() {
		return equipments;
	}
	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	public int[] getLevelXps() {
		return levelXps;
	}
	public void setLevelXps(int[] levelXps2) {
		this.levelXps = levelXps2;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	

}
