package TestingSystem;

import TestingSystem.Modelu.Data;
import TestingSystem.UAI.Interface;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicInteger;

import static TestingSystem.Configuration.COUNTANSWERS;
import static TestingSystem.Configuration.COUNTQUESTIONS;

public class Main {
    public static void main(String[] args) throws IOException {
        Interface ui = new Interface();
        ui.show();

        Data data = new Data();

        String[] voprosi = new String[COUNTQUESTIONS];
        String[] otveti = new String[COUNTANSWERS];

        int[] pravotveti = new int[COUNTQUESTIONS];
        data.setQuestions(voprosi);
        data.setAnswers(otveti);
        data.setRightAnswers(pravotveti);

//        FileReader readerQuestions = new FileReader("src/main/resources/questions.txt");
//        FileReader readerAnswers = new FileReader("src/main/resources/answers.txt");
//        FileReader readerRightAnswers = new FileReader("src/main/resources/rightAnswers.txt");
//
//        FileReader readerQuestions = new FileReader(new String(Files.readAllBytes(Paths.get("src/main/resources/questions.txt"))));
//        FileReader readerAnswers = new FileReader(new String(Files.readAllBytes(Paths.get("answers.txt"))));
//        FileReader readerRightAnswers = new FileReader(new String(Files.readAllBytes(Paths.get("rightAnswers.txt"))));

//        FileReader readerQuestions = new FileReader(String.valueOf((ClassLoader.getSystemResourceAsStream("questions.txt"))));
//        FileReader readerAnswers = new FileReader(String.valueOf(Main.class.getResourceAsStream("answers.txt")));
//        FileReader readerRightAnswers = new FileReader(String.valueOf(Main.class.getResourceAsStream("rightAnswers.txt")));


        BufferedReader reader1 = new BufferedReader(new InputStreamReader(
                ClassLoader.getSystemResourceAsStream("questions.txt"), "UTF-8"));

//        BufferedReader reader1 = new BufferedReader(readerQuestions);
        String line1 = reader1.readLine();
        int i = 0;
        while (line1 != null) {
            System.out.println(line1);
            voprosi[i] = line1;
            line1 = reader1.readLine();
            i++;
        }
        //2

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(
                ClassLoader.getSystemResourceAsStream("answers.txt"), "UTF-8"));
        String line2 = reader2.readLine();
        i = 0;
        while (line2 != null) {
            System.out.println(line2);
            otveti[i] = line2;
            line2 = reader2.readLine();
            i++;
        }
        //3
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(
                ClassLoader.getSystemResourceAsStream("rightAnswers.txt"), "UTF-8"));
        String line3 = reader3.readLine();
        i = 0;
        while (line3 != null) {
            System.out.println(line3);
            pravotveti[i] = Integer.parseInt(line3);
            line3 = reader3.readLine();
            i++;


        }


        //readerQuestions.close();
//        readerAnswers.close();
//        readerRightAnswers.close();

        Main.init(ui, voprosi, otveti);
        AtomicInteger counter = new AtomicInteger(1);
        ui.getButton1().addActionListener(event -> {

            if (counter.get() <= COUNTQUESTIONS) {

                Enumeration<AbstractButton> buttons = ui.getGroup().getElements();
                int selected = -1;
                for ( int j = 0; j < 4; j++) {
                    AbstractButton tempButton = buttons.nextElement();
                    if (tempButton.isSelected()) {
                        selected = Integer.parseInt(tempButton.getText());

                    }
                }
                if (selected == data.getRightAnswers()[counter.get()-1]) {
                     Data.score++;
                }
                System.out.println(selected);
                System.out.println(data.getRightAnswers()[counter.get()-1]);
                System.out.println(Data.score);


                if (counter.get() < COUNTQUESTIONS) Main.update(ui, voprosi, otveti, counter.get());
                else {
                    Main.showFinalScreen(ui);

                }
            }

            counter.getAndIncrement();
        });



    }

    public static void init(Interface ui, String[] voprosi, String[] otveti) {
        ui.getLabel0().setText(voprosi[0]);
        ui.getLabel1().setText(otveti[0]);
        ui.getLabel2().setText(otveti[1]);
        ui.getLabel3().setText(otveti[2]);
        ui.getLabel4().setText(otveti[3]);



    }

    public static void update(Interface ui, String[] voprosi, String[] otveti, int i) {
        ui.getLabel0().setText(voprosi[i]);
        ui.getLabel1().setText(otveti[4 * i]);
        ui.getLabel2().setText(otveti[4 * i + 1]);
        ui.getLabel3().setText(otveti[4 * i + 2]);
        ui.getLabel4().setText(otveti[4 * i + 3]);
        ui.getGroup().clearSelection();


    }
    public static void showFinalScreen(Interface qwerty) {
        qwerty.getMyWindow().setVisible(false);
        JFrame myWindow1 = new JFrame("The end");
        myWindow1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow1.setSize(300, 200);
        myWindow1.setResizable(false);
        myWindow1.setLocationRelativeTo(null);
        myWindow1.setVisible(true);
        JLabel labelscore = new JLabel(String.valueOf("Your Score = " + Data.score));
        myWindow1.add(labelscore);
        labelscore.setHorizontalAlignment(SwingConstants.CENTER);

    }

}



