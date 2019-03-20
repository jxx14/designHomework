package main.model.role;

import main.model.equipment.Equipment;
import main.model.weapon.Weapon;

import java.util.List;


public class Character1 extends Character {
	public static final int length = 30;
	public static final int width = 20;
	int[] levelXps = {0,3,6,10,15,21,27};
	
	public Character1(String name, int hp, int defense, int attack){
		super();
		this.setName(name);
		this.setXp(0);
		this.setHp(50);
		this.setDefense(30);
		this.setAttack(20);
		this.setDirection("no");
		this.setLevelXps(levelXps);
		this.setWeapons(null);
		this.setEquipments(null);
		Coordinate coo = new Coordinate(0,0);
		this.setCoordinate(coo);

		
	}
	@Override
	public void levelUp(int xp, int currentLevel) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public int getLevelFromXp(int xp) {
		// TODO Auto-generated method stub
		int levels = levelXps.length;
		for (int i=0;i < levels; i++){
			if (this.getXp() >= levelXps[i] && this.getXp() < levelXps[i+1]){
				this.setLevel(levelXps[i]);
				break;
			}
			
		}
		return 0;
	}

	@Override
	public int collectWeapon() {
		List<Weapon> weapons = super.getWeapons();
		int attack = this.getAttack();
		for (Weapon w : weapons){
			attack += w.getAddDamage();
		}
		this.setAttack(attack);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int collectEquipment() {
		List<Equipment> eqs = super.getEquipments();
		int defense = this.getDefense();
		for (Equipment eq : eqs){
			defense += eq.getAddDefense();
		}
		this.setDefense(defense);
		// TODO Auto-generated method stub
		return 0;
		
	}
	@Override
	public void move(String direction) {
		Coordinate curpos = super.getCoordinate();
		double x = curpos.getX();
		double y = curpos.getY();
		if (direction == "up"){
			if (y > 0){
				y -= 1;
			}
		}
		else if (direction == "down"){
			if (y < width-1){
				y += 1;
			}
		}
		
		else if (direction == "left"){
			if (x > 0){
				x -= 1;
			}
		}
		
		else if (direction == "right"){
			if (x < length-1){
				x += 1;
			}
		}
		else{}
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addWeapon(Weapon w) {
		List<Weapon> lw = this.getWeapons();
		lw.add(w);
		this.setWeapons(lw);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeWeapon(Weapon w) {
		// TODO Auto-generated method stub
		List<Weapon> lw = this.getWeapons();
		lw.remove(w);
		this.setWeapons(lw);
	}
	@Override
	public void addEquipment(Equipment e) {
		List<Equipment> le = this.getEquipments();
		le.add(e);
		this.setEquipments(le);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeEquipment(Equipment e) {
		List<Equipment> le = this.getEquipments();
		le.remove(e);
		this.setEquipments(le);
		// TODO Auto-generated method stub
		
	}
	
	

}
