package main.model.skill;

import java.util.ArrayList;
import java.util.List;

import main.model.role.Item;

public class Skill extends Item {
	private int damage;
	private String name;
	private int level;
	private List<Skill> lst;
	
	public Skill(String name,int damage){
		this.setName(name);
		this.setDamage(damage);
		this.setLevel(0);
		lst = new ArrayList<Skill>();
	}
	
	public void add(Skill s){
		lst.add(s);
	}
	
	public void remove(Skill s){
		lst.remove(s);
	}
	
	public List<Skill> getLst(){
		return lst;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
}
