package main.view;
/*
首先弹框：选择角色
角色选择参数战斗，根据战斗结果进行计算
*/


import main.model.enemy.Enemy;
import main.model.role.Role;
import main.model.role.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class MainView extends JFrame{

    //游戏板块的参数
    private static final int VIEW_WIDTH = 33;
    private static final int VIEW_HEIGHT = 22;
    private static final int VIEW_NUMBER = 22;

    JLabel stationLabel=new JLabel("敌我属性:");
    private JPanel jta1 =new JPanel();
    private JPanel jta2 =new JPanel();
    private JPanel jta3 =new JPanel();
    private JPanel jta4 =new JPanel();
    private JPanel jta5 =new JPanel();

    private String skill;
    private String weapon;
    private String equipment;

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
        JLabel stationLabel=new JLabel("敌我属性:"+"\n"+role.getName()+","+enemy.getName());

        //技能设置
        JLabel skillLabel=new JLabel("技能类型:");
        JComboBox skillComboBox=new JComboBox();
        String[] skills={"不使用技能","技能1","技能2","技能组合"};
        for (int i = 0; i <skills.length ; i++) {
            skillComboBox.addItem(skills[i]);
        }
        skillComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                skill =e.getItem().toString();
            }
        });

        //武器设置
        JLabel weaponLabel=new JLabel("武器类型:");
        JComboBox weaponComboBox=new JComboBox();
        String[] weapons={"不使用武器","武器1","武器2"};
        for (int i = 0; i <weapons.length ; i++) {
            weaponComboBox.addItem(weapons[i]);
        }
        weaponComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                weapon =e.getItem().toString();
            }
        });

        //装备设置
        JLabel equipmentLabel=new JLabel("装备类型:");
        JComboBox equipmentComboBox=new JComboBox();
        String[]equipments={"不使用装备","装备1","装备2"};
        for (int i = 0; i <weapons.length ; i++) {
            equipmentComboBox.addItem(equipments[i]);
        }
        equipmentComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                equipment =e.getItem().toString();
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
        jb.addActionListener(e -> {
            // 进行逻辑处理即可
            System.out.println("武器："+weapon+"    技能："+skill+"    装备："+equipment);
            fight(role,enemy);
        });

        this.add(jta4);
        this.add(jta1);
        this.add(jta2);
        this.add(jta3);
        this.add(jta5);


    }

    /*
    * 乱码测试
    * */

    //乱码测试

}
