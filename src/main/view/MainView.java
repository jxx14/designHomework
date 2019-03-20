package main.view;
/*
首先弹框：选择角色
角色遇到敌人，给出弹框让角色选择
角色选择战斗，根据战斗结果进行计算
角色选择投降，对角色实施一定的惩罚
*/


import main.model.enemy.Enemy;
import main.model.role.Role;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainView extends JFrame{

    //游戏板块的参数
    public static final int VIEW_WIDTH = 33;
    public static final int VIEW_HEIGHT = 22;
    public static final int VIEW_NUMBER = 22;

    JLabel stationLabel=new JLabel("敌我属性:");
    JPanel jta1 =new JPanel();
    JPanel jta2 =new JPanel();
    JPanel jta3 =new JPanel();
    JPanel jta4 =new JPanel();
    JPanel jta5 =new JPanel();

    String skill;
    String weapon;
    String equipment;

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
        this.setLayout(new GridLayout(5,1));

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
//        System.out.println(role.getName()+enemy.getName());

        //技能设置
        JLabel skillLabel=new JLabel("技能类型:");
        JComboBox skillComboBox=new JComboBox();
        String[] skills={"不使用技能","技能1","技能2","技能组合"};
        for (int i = 0; i <skills.length ; i++) {
            skillComboBox.addItem(skills[i]);
        }
        skillComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    skill =e.getItem().toString();
                }
            }
        });

        //武器设置
        JLabel weaponLabel=new JLabel("武器类型:");
        JComboBox weaponComboBox=new JComboBox();
        String[] weapons={"不使用武器","武器1","武器2"};
        for (int i = 0; i <weapons.length ; i++) {
            weaponComboBox.addItem(weapons[i]);
        }
        weaponComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    weapon =e.getItem().toString();
                }
            }
        });

        //装备设置
        JLabel equipmentLabel=new JLabel("装备类型:");
        JComboBox equipmentComboBox=new JComboBox();
        String[]equipments={"不使用装备","装备1","装备2"};
        for (int i = 0; i <weapons.length ; i++) {
            equipmentComboBox.addItem(equipments[i]);
        }
        equipmentComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    equipment =e.getItem().toString();
                }
            }
        });

        jta1.add(skillLabel);
        jta1.add(skillComboBox);
        jta2.add(weaponLabel);
        jta2.add(weaponComboBox);
        jta3.add(equipmentLabel);
        jta3.add(equipmentComboBox);
        jta4.add(stationLabel);

        JButton jb = new JButton("确定");
        jta5.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 进行逻辑处理即可
                System.out.println("武器："+weapon+"    技能："+skill+"    装备："+equipment);
                //        fight(role,enemy);
            }
        });

        this.add(jta4);
        this.add(jta1);
        this.add(jta2);
        this.add(jta3);
        this.add(jta5);


    }


}
