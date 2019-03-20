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
import java.awt.*;

public class MainView extends JFrame{


    //游戏板块的参数
    public static final int VIEW_WIDTH = 33;
    public static final int VIEW_HEIGHT = 22;
    public static final int VIEW_NUMBER = 22;
    JLabel stationLabel=new JLabel("敌我属性:");


    public static void main(String[] args) {
        new MainView().choiceRole();
    }

    //选择角色的对话框
    public void choiceRole() {
        String[] str={"role1","role2"};
        String roleKind = JOptionPane.showInputDialog(null,"选择角色类型","选择角色类型",1,null,str,str[0]).toString();
        drawView(new Role(roleKind));
    }

    //战斗界面
    private void drawView(Role role) {
        this.setTitle(role.getName());    //设置显示窗口标
        this.setLayout(new GridLayout(7,1));

        Enemy enemy = new Enemy();
        enemy.setName("小鬼");
        fight(role,enemy);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //窗口是否可以关闭
        this.setBounds(400,100,VIEW_WIDTH * VIEW_NUMBER , VIEW_HEIGHT * VIEW_NUMBER );//设置窗口的大小
        this.setVisible(true);
    }


    //战斗
    public void fight(Role role,Enemy enemy) {

        //敌我属性
        JLabel stationLabel=new JLabel("敌我属性:");
        System.out.println(role.getName()+enemy.getName());

        //技能设置
        JLabel skillLabel=new JLabel("技能类型:");
        JComboBox skillComboBox=new JComboBox();
        skillComboBox.setPreferredSize(new Dimension(3,3));
        String[] skills={"不使用技能","技能1","技能2","技能组合"};
        for (int i = 0; i <skills.length ; i++) {
            skillComboBox.addItem(skills[i]);
        }

        //武器设置
        JLabel weaponLabel=new JLabel("武器类型:");
        JComboBox weaponComboBox=new JComboBox();
        String[] weapons={"不使用武器","武器1","武器2"};
        for (int i = 0; i <weapons.length ; i++) {
            weaponComboBox.addItem(weapons[i]);
        }


        //装备设置
        JLabel equipmentLabel=new JLabel("装备类型:");
        JComboBox equipmentComboBox=new JComboBox();
        String[]equipments={"不使用装备","装备1","装备2"};
        for (int i = 0; i <weapons.length ; i++) {
            equipmentComboBox.addItem(equipments[i]);
        }

        this.getContentPane().add(stationLabel);

        this.getContentPane().add(skillLabel);
        this.getContentPane().add(skillComboBox);

        this.getContentPane().add(weaponLabel);
        this.getContentPane().add(weaponComboBox);

        this.getContentPane().add(equipmentLabel);
        this.getContentPane().add(equipmentComboBox);

//        fight(role,enemy);
    }


}
