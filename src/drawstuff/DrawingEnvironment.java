/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author LK
 */
class DrawingEnvironment extends Environment {

    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.WHITE);

    }

    Image logo = null;

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        

        graphics.setColor(new Color(0, 200, 160, 100));
        graphics.fillOval(650, 300, 100, 100);
        graphics.setColor(new Color(200, 200, 0, 100));
        graphics.fillOval(750, 200, 100, 100);
        graphics.setColor(new Color(200, 200, 200, 100));
        graphics.fillOval(630, 120, 100, 100);
        graphics.setColor(new Color(0, 0, 200, 100));
        graphics.fillOval(760, 400, 100, 100);
        graphics.setColor(new Color(200, 0, 0, 100));
        graphics.fillOval(550, 390, 100, 100);
        graphics.setColor(new Color(0, 200, 0, 100));
        graphics.fillOval(750, 60, 100, 100);
        graphics.setColor(new Color(200, 200, 0, 100));
        graphics.fillOval(50, 160, 100, 100);
        graphics.setColor(new Color(0, 200, 200, 100));
        graphics.fillOval(90, 30, 100, 100);
        graphics.setColor(new Color(200, 100, 0, 100));
        graphics.fillOval(120, 300, 100, 100);
        graphics.setColor(new Color(0, 200, 0, 100));
        graphics.fillOval(80, 400, 100, 100);
        graphics.setColor(new Color(200, 0, 200, 100));
        graphics.fillOval(230, 30, 100, 100);
        graphics.setColor(new Color(140,0, 200, 100));
        graphics.fillOval(230, 400, 100, 100);
        graphics.setColor(new Color(100, 50, 100, 100));
        graphics.fillOval(180, 200, 100, 100);
        graphics.setColor(new Color(0, 130, 100, 100));
        graphics.fillOval(600, 20, 100, 100);
        graphics.setColor(new Color(190, 40, 100, 100));
        graphics.fillOval(655, 210, 100, 100);
        graphics.setColor(new Color(200, 0, 0, 100));
        graphics.fillOval(100, 230, 100, 100);
        graphics.setColor(new Color(0, 200, 0,100));
        graphics.fillOval(400, 410, 100, 100);
        graphics.setColor(new Color(30, 50, 200, 100));
        graphics.fillOval(640, 380, 100, 100);
        graphics.setColor(new Color(20, 200, 70, 100));
        graphics.fillOval(160, 70, 100, 100);
        graphics.setColor(new Color(200, 50, 20, 100));
        graphics.fillOval(350, -30, 100, 100);
        graphics.setColor(new Color(100, 50, 200, 100));
        graphics.fillOval(-90, 250, 100, 100);
        graphics.setColor(new Color(0, 200, 0, 100));
        graphics.fillOval(-60, 50, 100, 100);
        graphics.setColor(new Color(0, 0, 200, 100));
        graphics.fillOval(-40, 500, 100, 100);
        graphics.setColor(new Color(100, 140, 90, 100));
        graphics.fillOval(870, 200, 100, 100);
        graphics.setColor(new Color(100, 50, 200, 100));
        graphics.fillOval(860, 525, 100, 100);
        graphics.setColor(new Color(200, 0, 0, 100));
        graphics.fillOval(850, -35, 100, 100);
        graphics.setColor(new Color(200, 200, 0, 100));
        graphics.fillOval(300, 550, 100, 100);
        graphics.setColor(new Color(0, 200, 200, 100));
        graphics.fillOval(600, 570, 100, 100);
        graphics.setColor(new Color(100, 50, 200, 100));
        graphics.fillOval(420, -70, 100, 100);
        graphics.setColor(new Color(0, 50, 200, 100));
        graphics.fillOval(700, -90, 100, 100);
        graphics.setColor(new Color(200, 0, 0, 100));
        graphics.fillOval(70, -95, 100, 100);
        graphics.setColor(new Color(140, 40, 120, 100));
        graphics.fillOval(300, 100, 100, 100);
        graphics.setColor(new Color(0, 200, 0, 100));
        graphics.fillOval(530, 150, 100, 100);
        graphics.setColor(new Color(200, 0, 0, 100));
        graphics.fillOval(300, 300, 100, 100);
        graphics.setColor(new Color(0, 0, 200, 100));
        graphics.fillOval(530, 300, 100, 100);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Calibri", Font.BOLD, 50));
        graphics.drawString("Everywhere. Years ahead!", 120, 550);
        if (logo != null) {
            graphics.drawImage(logo, 250, 40, 400, 400, this);

        }

        
    }

}
