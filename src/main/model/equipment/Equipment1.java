package main.model.equipment;

public class Equipment1 extends Equipment{

	public Equipment1(int level, String name, int addDefense){
		super();
		super.setLevel(0);
		super.setName("Aba");
		super.setAddDefense(50);
	}
	
	@Override
	public void moreDefense(int d){
		int defense = this.getAddDefense();
		defense += d;
		this.setAddDefense(defense);
	}
}
