package com.mamithi;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class ShapesJPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(new GradientPaint(5, 30, Color.BLUE, 35, 100,
                Color.YELLOW, true));
        g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

        BufferedImage bufferedImage = new BufferedImage(10, 10,
                BufferedImage.TYPE_INT_RGB);

        Graphics2D gg = bufferedImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(0, 0, 10, 10);
        gg.setColor(Color.BLACK);
        gg.drawRect(1, 1, 6,6);
        gg.setColor(Color.BLUE);
        gg.fillRect(1,1,3,3);
        gg.setColor(Color.RED);
        gg.fillRect(4,4,3,3);

        gg.setPaint(new TexturePaint(bufferedImage,
                new Rectangle(10, 10)));
        g2d.fill(
                new RoundRectangle2D.Double(155,30,75,100,50,50)
        );

        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(
                new Arc2D.Double(240,30, 75,100,0,270, Arc2D.PIE)
        );


        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(495, 30, 320, 150));

        float[] dashes = { 10 };
        g2d.setPaint( Color.YELLOW );
        g2d.setStroke( new BasicStroke( 4, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 10, dashes, 0 ) );
        g2d.draw( new Line2D.Double( 320, 30, 395, 150 ) );




    }
}
