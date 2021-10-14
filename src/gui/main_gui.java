package gui;

import javax.swing.*;
import java.awt.*;

public class main_gui {
    private JButton button1;
    private JPanel panelmain;


    public main_gui(){

    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("AFK");

        frame.setContentPane(new main_gui().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.pack();
        frame.setVisible(true);


        System.out.println("Test");
    }


}
