package TestingSystem.UAI;

import javax.swing.*;
import java.awt.*;


public class Interface {


    private JLabel label0 = new JLabel();


    private ButtonGroup group = new ButtonGroup();

    private JRadioButton radioButton1 = new JRadioButton("1" ,false);
    private JRadioButton radioButton2 = new JRadioButton("2" ,false);
    private JRadioButton radioButton3 = new JRadioButton("3" ,false);
    private JRadioButton radioButton4 = new JRadioButton("4" ,false);


    private JButton button1 = new JButton("OK");

    private JLabel label1 = new JLabel("1)");
    private JLabel label2 = new JLabel("2)");
    private JLabel label3 = new JLabel("3)");
    private JLabel label4 = new JLabel("4)");

    private JPanel panel = new JPanel();


    private JFrame myWindow = new JFrame("Check knowledge");


    public void show() {
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(800, 600);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);

        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);


        radioButton1.setBounds(50, 300, 20, 20);

        radioButton2.setBounds(50, 450, 20, 20);

        radioButton3.setBounds(400, 300, 20, 20);

        radioButton4.setBounds(400, 450, 20, 20);

        button1.setBounds(600, 500, 100, 30);


        label0.setBounds(320, 150, 2000, 20);
        label1.setAlignmentX(Component.RIGHT_ALIGNMENT);

        label1.setBounds(70, 300, 800, 20);

        label2.setBounds(70, 450, 800, 20);

        label3.setBounds(420, 300, 800, 20);

        label4.setBounds(420, 450, 800, 20);


        myWindow.add(radioButton1);
        myWindow.add(radioButton2);
        myWindow.add(radioButton3);
        myWindow.add(radioButton4);
        myWindow.add(button1);
        myWindow.add(label0);
        myWindow.add(label1);
        myWindow.add(label2);
        myWindow.add(label3);
        myWindow.add(label4);
        myWindow.add(panel);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);
        panel.add(button1);
        panel.add(label0);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);



        panel.setLayout(null);
        myWindow.setVisible(true);

    }

    public JLabel getLabel0() {
        return label0;
    }

    public void setLabel0(JLabel label0) {
        this.label0 = label0;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public void setRadioButton1(JRadioButton radioButton1) {
        this.radioButton1 = radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public void setRadioButton2(JRadioButton radioButton2) {
        this.radioButton2 = radioButton2;
    }

    public JRadioButton getRadioButton3() {
        return radioButton3;
    }

    public void setRadioButton3(JRadioButton radioButton3) {
        this.radioButton3 = radioButton3;
    }

    public JRadioButton getRadioButton4() {
        return radioButton4;
    }

    public void setRadioButton4(JRadioButton radioButton4) {
        this.radioButton4 = radioButton4;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public ButtonGroup getGroup() {
        return group;
    }

    public void setGroup(ButtonGroup group) {
        this.group = group;
    }

    public JFrame getMyWindow() {
        return myWindow;
    }

    public void setMyWindow(JFrame myWindow) {
        this.myWindow = myWindow;
    }
}