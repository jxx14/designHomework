package main.model.skill;

public class SkillTest {
	Skill s1 = new Skill("skill1", 3);
	Skill s2 = new Skill("skill2", 5);
	Skill s3 = new Skill("skill3", 6);
	//skill1;
	public void composite(){
		s3.add(s1);
		s3.add(s2);
	}
	
}
