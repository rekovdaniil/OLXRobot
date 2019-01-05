package Treads;

import Utils.GlobalVars;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Daniil on 08.07.2018.
 */
public class MouseLocator extends Thread {

    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1 / 2);
                double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
                double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
                GlobalVars.MOUSELABEL.setText("Mouse current position:" + " X= " + mouseX + "; Y= " + mouseY + ";");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}