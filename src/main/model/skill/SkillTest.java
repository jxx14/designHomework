package main.model.skill;

public class SkillTest {
	Skill skill1 = new Skill("skill1", 3);
	Skill skill2 = new Skill("skill2", 5);
	Skill skill3 = new Skill("skill3", 6);
	skill3.add(skill1);
	skill3.add(skill2);

}
