package Treads;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import Frames.*;

/**
 * Created by Daniil on 08.07.2018.
 */
public class GUIstarter extends Thread {
    public void run() {
            JFrame GUI = new JFrame();
            GUI.setContentPane(new GUI().ButtonPanel);
            GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GUI.setSize(400,300);
            GUI.setVisible(true);

    }
}



