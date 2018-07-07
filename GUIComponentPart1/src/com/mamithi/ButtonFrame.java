package com.mamithi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JButton plainJButton, fancyJButton;

    public ButtonFrame() {
        super("Tesing Buttons");

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug.png"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this,
                    String.format("You presssed: %s", event.getActionCommand()));
        }
    }

}
