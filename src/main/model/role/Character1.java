package main.model.role;

import main.model.equipment.Equipment;
import main.model.weapon.Weapon;

import java.util.List;


public class Character1 extends Character {
	public static final int length = 30;
	public static final int width = 20;
	public static int[] levelXps = {0,3,6,10,15,21,27};
	
	public Character1(String name){
		super(name);
		this.setXp(0);
		this.setHp(50);
		this.setDefense(30);
		this.setAttack(20);
		this.setLevelXps(levelXps);
		this.setWeapon(null);
		this.setEquipment(null);

		
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
		Weapon w = super.getWeapon();
		int attack = this.getAttack();
		if(w!=null) attack += w.getAddDamage();
		
		this.setAttack(attack);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int collectEquipment() {
		Equipment eq = super.getEquipment();
		int defense = this.getDefense();
		if(eq!=null) defense += eq.getAddDefense();
		
		this.setDefense(defense);
		// TODO Auto-generated method stub
		return 0;
		
	}


	@Override
	public void removeWeapon(Weapon w) {
		// TODO Auto-generated method stub

		this.setWeapon(null);
	}

	@Override
	public void removeEquipment(Equipment e) {

		this.setEquipment(null);
		// TODO Auto-generated method stub
		
	}
	
	

}
