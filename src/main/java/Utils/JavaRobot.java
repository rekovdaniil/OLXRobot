package Utils;

import Utils.GlobalVars;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class JavaRobot {

    Robot robot = new Robot();

    public JavaRobot() throws AWTException {
        robot.setAutoDelay(40);
        robot.setAutoWaitForIdle(true);
    }

    public void Drag(int x1, int y1, int x2, int y2) {

        while (GlobalVars.MOUSE_X != x1 || GlobalVars.MOUSE_Y != y1) {
            robot.mouseMove(x1, y1);
            getMouseLocation();
        }
        System.out.println("<----Drag from");
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        while (GlobalVars.MOUSE_X != x2 || GlobalVars.MOUSE_Y != y2) {
            robot.mouseMove(x2, y2);
            getMouseLocation();
        }
        System.out.println("<----Drag till");

        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    public void doubleleftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }


    public void rightClick() {
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        robot.delay(200);

    }

    public void wait(int i) {
        robot.delay(i);
    }

    public void Ctrl_A() {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_Z);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }


    public void write(String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            if (code > 96 && code < 123) {
                code = code - 32;
            }
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }

    public void mouseMv(int x, int y) {
        while (GlobalVars.MOUSE_X != x || GlobalVars.MOUSE_Y != y) {
            robot.mouseMove(x, y);
            getMouseLocation();
        }
        System.out.println("----------");
    }

    public void AddTextToClipboard(String description) {
        StringSelection stringSelection = new StringSelection(description);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void EnterKey() {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(40);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void getMouseLocation() {
        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
        System.out.println("X:" + mouseX + " Y:" + mouseY);
        GlobalVars.MOUSE_X = mouseX;
        GlobalVars.MOUSE_Y = mouseY;
    }
}