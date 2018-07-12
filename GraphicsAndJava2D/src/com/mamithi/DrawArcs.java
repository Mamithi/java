package com.mamithi;

import javax.swing.*;

public class DrawArcs {
    public static void main(String[] args){
        JFrame frame = new JFrame("Drawing arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300, 210);
        frame.setVisible(true);
    }
}
