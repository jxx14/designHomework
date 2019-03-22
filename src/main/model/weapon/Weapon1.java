package main.model.weapon;

public class Weapon1 extends Weapon{
	
	public Weapon1(){
		this.setLevel(0);
		this.setName("Weapon1");
		this.setAddDamage(40);
	}

	@Override
	public void moreDamage(int d) {
		// TODO Auto-generated method stub
		int damage = this.getAddDamage();
		damage += d;
		this.setAddDamage(damage);
		
	}
	
	

}
