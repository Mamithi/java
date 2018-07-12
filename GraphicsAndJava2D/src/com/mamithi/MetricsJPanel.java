package com.mamithi;

import javax.swing.*;
import java.awt.*;

public class MetricsJPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setFont(new Font("SansSerif", Font.BOLD, 12));

        FontMetrics metrics = g.getFontMetrics();
        g.drawString("Current Font: " + g.getFont(), 10, 30);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 45);
        g.drawString("Descent: " + metrics.getDescent(), 10, 60);
        g.drawString("Height: " + metrics.getHeight(), 10, 75);
        g.drawString("Leading: " + metrics.getLeading(), 10, 90);

        Font font = new Font("Serif", Font.ITALIC, 14);
        metrics = g.getFontMetrics(font);
        g.drawString("Current Font: " + font, 10, 120);
        g.drawString("Ascent: " + metrics.getAscent(), 10, 135);
        g.drawString("Descent: " + metrics.getDescent(), 10, 150);
        g.drawString("Height: " + metrics.getHeight(), 10, 165);
        g.drawString("Leading: " + metrics.getLeading(), 10, 180);
    }
}
