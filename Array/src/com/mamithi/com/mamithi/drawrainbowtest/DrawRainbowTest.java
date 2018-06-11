package com.mamithi.com.mamithi.drawrainbowtest;

import com.mamithi.drawrainbow.DrawRainBow;

import javax.swing.*;

public class DrawRainbowTest {
    public static void main(String[] args){
        DrawRainBow panel = new DrawRainBow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
}
