package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowColors2Frame extends JFrame {
    private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;

    public ShowColors2Frame() {
        super("Using JColorChooser");

        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(
                                ShowColors2Frame.this, "Choose Color", color
                        );

                        if (color == null)
                            color = Color.LIGHT_GRAY;

                        colorJPanel.setBackground(color);
                    }
                }
        );

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);

    }
}
