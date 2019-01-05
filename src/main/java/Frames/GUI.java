package Frames;

import Treads.MouseLocator;
import Utils.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daniil on 08.07.2018.
 */
public class GUI {
    public JPanel ButtonPanel;
    private JButton deleteOLXItemButton;
    private JButton addOLXItemsButton;
    public JLabel MouseLabel;
    private JButton locateMouseButton;

    public GUI() {
        deleteOLXItemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogicOLX LogicUnitOLX = new LogicOLX();
                LogicUnitOLX.WaitAndDelete();
            }
        });
        addOLXItemsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LogicOLX LogicUnitOLX = new LogicOLX();
                LogicUnitOLX.WaitAndAdd();
            }
        });
        GlobalVars.MOUSELABEL = MouseLabel;


    }
}
