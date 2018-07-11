package com.mamithi;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JFrame {
    private JPanel buttonJPanel;
    private JButton[] buttons;

    public PanelFrame(){
        super("Panel Demo");

        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        for(int count = 0; count < buttons.length; count++){
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]);
        }

        add(buttonJPanel, BorderLayout.SOUTH);
    }
}
