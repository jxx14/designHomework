package main.model.weapon;

public class Weapon1 extends Weapon{
	
	public Weapon1(String name, int addDamage){
		this.setLevel(0);
		this.setName(name);
		this.setAddDamage(addDamage);
	}

	@Override
	public void moreDamage(int d) {
		// TODO Auto-generated method stub
		int damage = this.getAddDamage();
		damage += d;
		this.setAddDamage(damage);
		
	}
	
	

}
