package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private static final String[] names ={
            "one", "two", "three", "four", "five", "six"
    };

    private boolean toggle = true;
    private Container container;
    private GridLayout gridLayout1, gridLayout2;

    public GridLayoutFrame(){
        super("GridLayout Demo");

        gridLayout1 = new GridLayout(2, 3,5,5);
        gridLayout2 = new GridLayout(3, 2);
        container = getContentPane();
        setLayout(gridLayout1);
        buttons = new JButton[names.length];

        for(int count = 0; count < names.length; count++){
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }
    }

    public void actionPerformed(ActionEvent event){
        if(toggle){
            container.setLayout(gridLayout2);
        }else{
            container.setLayout(gridLayout1);
        }

        toggle = !toggle;
        container.validate();
    }


}