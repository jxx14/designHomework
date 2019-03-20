package main.model.weapon;

public class Weapon1 extends Weapon{
	
	public Weapon1(String name, int addDefense){
		super();
		this.setLevel(0);
		this.setName(name);
		this.setAddDamage(addDefense);
	}

	@Override
	public void moreDamage(int damage) {
		// TODO Auto-generated method stub
		
	}
	
	

}
