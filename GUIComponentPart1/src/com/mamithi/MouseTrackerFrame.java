package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseTrackerFrame extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;

    public MouseTrackerFrame(){
        super("Demonstrating Mouse events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel();
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener,  MouseMotionListener {
       public void mouseClicked(MouseEvent event){
           statusBar.setText(String.format("Clicked at [%d, %d]",
                   event.getX(), event.getY()));
       }

       public void mousePressed(MouseEvent event){
           statusBar.setText(String.format("Pressed at [%d, %d]",
                   event.getX(), event.getY()));
       }

       public void mouseReleased(MouseEvent event){
           statusBar.setText(String.format("Released at [%d, %d]",
                   event.getX(), event.getY()));
       }
       public void mouseEntered(MouseEvent event){
           statusBar.setText(String.format("Mouse enetered at [%d, %d]",
                   event.getX(), event.getY()));
           mousePanel.setBackground(Color.GREEN);
       }

       public void mouseExited(MouseEvent event){
           statusBar.setText("Mouse outside JPanel");
           mousePanel.setBackground(Color.WHITE);
       }

       public void mouseDragged(MouseEvent event){
           statusBar.setText(String.format("Dragged at [%d, %d]",
                   event.getX(), event.getY()));
       }

       public void mouseMoved(MouseEvent event){
           statusBar.setText(String.format("Moved at [%d, %d]",
                   event.getX(), event.getY()));
       }
    }
}
