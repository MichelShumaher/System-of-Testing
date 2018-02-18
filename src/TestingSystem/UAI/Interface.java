package TestingSystem.UAI;

import javax.swing.*;

public class Interface {


        public void show(){
            JFrame myWindow = new JFrame("System of Testing");
            myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myWindow.setSize(400, 300);
            myWindow.setVisible(true);
            myWindow.setLocationRelativeTo(null);

    }
}