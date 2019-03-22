package main.model.enemy;

import main.model.role.Role;

public abstract class Enemy extends Role{
    public Enemy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
