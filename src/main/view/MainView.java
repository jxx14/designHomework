package main.view;
/*
首先弹框：选择角色
角色遇到敌人，给出弹框让角色选择
角色选择战斗，根据战斗结果进行计算
角色选择投降，对角色实施一定的惩罚
*/

import main.model.Enemy;
import main.model.Role;

import javax.swing.*;

public class MainView{

    public static void main(String[] args) {
        new MainView().choiceRole();
    }

    //选择角色的对话框
    public void choiceRole() {
        String[] str={"role1","role2"};
        String roleKind = JOptionPane.showInputDialog(null,"请选择用户名","选择用户名",1,null,str,str[0]).toString();

        if (roleKind.equalsIgnoreCase("role1")){
            System.out.println("选择了角色1");
            fight(new Role("zhangsan"),new Enemy());
        }else {
            System.out.println("选择了角色2");
            fight(new Role("lisi"),new Enemy());
        }
    }

    //战斗
    public void fight(Role role,Enemy enemy) {
        int choice=JOptionPane.showConfirmDialog(null,role.getName()+",你和敌方的基本属性如下：，你要选择进行战斗吗",role.getName(),0);
        if (choice== JOptionPane.YES_OPTION){
            System.out.println("您选择了进行战斗");
            //设置参数
        }else if(choice ==JOptionPane.NO_OPTION){
            System.out.println("您选择了放弃");
            //设置参数
        }else {
            System.exit(0);
        }
        fight(role,enemy);
    }

}
