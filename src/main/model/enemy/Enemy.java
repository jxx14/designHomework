package main.model.enemy;

public abstract class Enemy{
    String name;
    private int hp;
	private int defense;
	private int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
