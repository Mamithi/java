package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDetailsFrame extends JFrame {
    private String details;
    private JLabel statusBar;

    public MouseDetailsFrame(){
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseClickHandler extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            int xPos = event.getX();
            int yPos = event.getY();

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if(event.isMetaDown()){
                details += " with right mouse button";
            } else if(event.isAltDown()){
                details += " with center mouse button";
            }else{
                details += " with left mouse button";
            }

            statusBar.setText(details);

        }
    }
}
