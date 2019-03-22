package main.controller;

import main.model.enemy.*;
import main.model.role.Character;
import main.model.role.Role;

public class RoleController {
	public Role fight(Character r, Enemy e){
		Role winner;
		int cDefense = r.getDefense();
		int eDefense = e.getDefense();
		int cAttack = r.getAttack();
		int eAttack = e.getDefense();
		int cHp = r.getHp();
		int eHp = r.getHp();
		double score = 0.4*(cDefense - eDefense) + 0.3*(cAttack - eAttack)+0.3*(cHp-eHp);
		if (score > 10) winner = r;
		else winner = e;
		if (winner == r){
			r.setXp(r.getXp() + (int)score);
		}
		return winner;
		
		
	}
	
	public void addDefense(Character r){
		r.collectEquipment();
	}
	
	public void addAttack(Character r){
		r.collectWeapon();
	}

}
