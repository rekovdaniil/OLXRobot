package Utils;

import Frames.GUI;
import Treads.GUIstarter;
import Treads.MouseLocator;
import Utils.GlobalVars;
import Utils.JavaRobot;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Daniil on 07.07.2018.
 */
public class main {
    public static void main(String[] args) throws AWTException {
        // Thread t1 = new Thread(new GUIstarter());
        // t1.start();
        JFrame GUI = new JFrame();
        GUI.setContentPane(new GUI().ButtonPanel);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(400,300);
        GUI.setVisible(true);
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

        public static void AddItemOLX(String Path, String Title, String Description, int Price)
    {
        GlobalVars GlobalVars = new GlobalVars();
        //Scenario Add!!!
        JavaRobot JRobot = null;
        try {
            JRobot = new JavaRobot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        JRobot.mouseMv(218, 1045); //координаты хрома
        JRobot.leftClick();
        JRobot.mouseMv(300, 52); //адресная строка
        JRobot.doubleleftClick();
        JRobot.leftClick();
        JRobot.write("olx.ua");
        JRobot.mouseMv(300, 85);
        JRobot.leftClick();
        JRobot.wait(3000);
        JRobot.mouseMv(1363,153);
        JRobot.leftClick();
        //Скопировать в буфер название лота
        JRobot.AddTextToClipboard(Title);
        JRobot.mouseMv(695,311);
        JRobot.wait(1000);
        JRobot.rightClick();
        JRobot.wait(1000);
        JRobot.mouseMv(767,461);
        JRobot.leftClick();
        JRobot.mouseMv(934,414);
        JRobot.leftClick();
        JRobot.wait(1000);
        JRobot.mouseMv(469,431);
        JRobot.leftClick();
        JRobot.wait(1000);
        JRobot.mouseMv(779,592);
        JRobot.leftClick();
        JRobot.write(Integer.toString(Price));
        JRobot.mouseMv(818,722);
        JRobot.leftClick();
        JRobot.wait(500);
        JRobot.mouseMv(750,750);
        JRobot.leftClick();

        JRobot.mouseMv(721,1021);
        JRobot.leftClick();
        JRobot.wait(500);
        JRobot.mouseMv(780,400);
        JRobot.leftClick();
       // Смена папки  Добавить
        JRobot.wait(500);
        JRobot.mouseMv(607,57);
        JRobot.leftClick();
        JRobot.wait(500);

        JRobot.AddTextToClipboard(Path);
        JRobot.rightClick();
        JRobot.mouseMv(290,153);
        JRobot.wait(500);
        JRobot.leftClick();
        JRobot.wait(500);
        JRobot.mouseMv(662,58);
        JRobot.wait(500);
        JRobot.leftClick();
        JRobot.wait(500);
        JRobot.mouseMv(900,425);
        JRobot.Drag(900,425,224,148);
        JRobot.mouseMv(757,557);
        JRobot.leftClick();
        JRobot.mouseMv(661,60);
        JRobot.leftClick();

        JRobot.Drag(1910, 222, 1909, 480);
        JRobot.mouseMv(439,411);
        JRobot.leftClick();
        JRobot.mouseMv(745,645);
        JRobot.leftClick();

        JRobot.Drag(1910, 580, 1913, 980);
        JRobot.wait(3000);

        JRobot.mouseMv(707,341);
        JRobot.doubleleftClick();
        JRobot.leftClick();
        JRobot.AddTextToClipboard("Киев");
        JRobot.rightClick();
        JRobot.mouseMv(773,427);
        JRobot.leftClick();
        JRobot.write(" ");
        JRobot.wait(500);
        JRobot.mouseMv(777,381);
        JRobot.wait(500);
        JRobot.mouseMv(877,381);
        JRobot.wait(500);
        JRobot.mouseMv(977,381);
        JRobot.wait(500);
        JRobot.mouseMv(1077,381);
        JRobot.wait(500);
        JRobot.mouseMv(1077,381);
        JRobot.wait(500);
        JRobot.mouseMv(1288,386);
        JRobot.wait(500);
        JRobot.mouseMv(1300,656);
        JRobot.leftClick();
        JRobot.mouseMv(747,407);
        JRobot.doubleleftClick();
        JRobot.write("0631210824");

        //Описание
        JRobot.Drag(1910, 980, 1909, 222);
        JRobot.mouseMv(711,793);
        JRobot.AddTextToClipboard(Description);
        JRobot.rightClick();
        JRobot.mouseMv(799,563);
        JRobot.leftClick();
        JRobot.Drag(1910, 222, 1909, 980);

        JRobot.mouseMv(1340,635);
        JRobot.leftClick();
        //оплата
        JRobot.wait(4000);
        JRobot.mouseMv(1444,435);
        JRobot.leftClick();
        JRobot.wait(1500);
        JRobot.mouseMv(1310,805);
        JRobot.leftClick();
        JRobot.wait(1000);
        JRobot.Drag(1910, 222, 1909, 980);
        JRobot.mouseMv(1440,904);
        JRobot.wait(1000);
        JRobot.leftClick();
        JRobot.wait(5000);
        JRobot.leftClick();
        JRobot.wait(10000);
        //закрыть хром
        JRobot.mouseMv(1888,17);
        JRobot.leftClick();
        JRobot.wait(5000);


    }

    public static void DeleteOLXitem()
    {
        GlobalVars GlobalVars = new GlobalVars();
        //Scenario Delete!!!
        JavaRobot JRobot = null;
        try {
            JRobot = new JavaRobot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        String descriptionDelete = "Продам \n" +
                "мікронавушники Микронаушники - 500 грн \n" +
                "брелоки-камери - Брелок скрытая камера 500 грн \n" +
                "окуляри з вбудованою камерою - 400 грн\n" +
                " годинник-камера - 700 грн\n" +
                "Антирадари - 700 грн\n" +
                "рамки-шторки - 800 грн\n" +
                " антипрослушки - 900 грн\n" +
                " антижучки - 1000 грн\n" +
                "газові балончики Газовые балончики - 700 грн\n" +
                "газові пістолети  Газовые пистолеты - 800 грн\n" +
                " зброя з гумовими кулями - 900 Грн";
        JRobot.AddTextToClipboard(descriptionDelete);
        JRobot.mouseMv(218, 1045);
        JRobot.leftClick();
        JRobot.mouseMv(300, 52);
        JRobot.doubleleftClick();
        JRobot.leftClick();
        JRobot.write("olx.ua");
        JRobot.mouseMv(300, 85);
        JRobot.leftClick();
        JRobot.wait(3000);
        JRobot.mouseMv(1160, 155);
        JRobot.mouseMv(1150, 230);
        JRobot.leftClick();
        JRobot.wait(3000);
        JRobot.mouseMv(754, 692);
        JRobot.leftClick();
        JRobot.mouseMv(749, 710);
        JRobot.leftClick();
        JRobot.wait(3000);
        JRobot.mouseMv(749, 798);
        JRobot.rightClick();
        JRobot.mouseMv(841, 627);
        JRobot.leftClick();
        JRobot.mouseMv(783, 798);
        JRobot.rightClick();
        JRobot.mouseMv(869, 501);
        JRobot.leftClick();
        JRobot.Drag(1910, 222, 1913, 955);
        JRobot.mouseMv(711, 411);
        JRobot.doubleleftClick();
        JRobot.write("0992891619");
        JRobot.mouseMv(1331, 632);
        JRobot.leftClick();
        JRobot.wait(2000);
        JRobot.mouseMv(1888,17);
        JRobot.leftClick();
        JRobot.wait(2000);


    }


}