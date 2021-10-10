package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MyScreen extends Screen{

    int windowHeight = getScreenFactory().getGame().getWindowHeight();
    int windowLength = getScreenFactory().getGame().getWindowWidth();

    int topOffset = 30;
    int bottomOffset = 60;
    int sideOffset = 35;

    int upperBoundary= topOffset;
    int leftBoundary= sideOffset;
    int bottomBoundary = windowHeight-bottomOffset;
    int rightBoundary = windowLength-sideOffset;

    int width=30;
    int height=80;
    int x=windowLength/2-width/2;
    int y=bottomBoundary-height;


    public MyScreen(ScreenFactory screenFactory) {
        super(screenFactory);
    }

    @Override
    public void onCreate() {
        System.out.println("Creating...");
    }

    @Override
    public void onUpdate() {
        if(getScreenFactory().getGame().getKeyboardListener().isKeyTyped(KeyEvent.VK_LEFT)){
            x-=5;
        }
        if(getScreenFactory().getGame().getKeyboardListener().isKeyTyped(KeyEvent.VK_RIGHT)){
            x+=5;
        }
        if(getScreenFactory().getGame().getKeyboardListener().isKeyTyped(KeyEvent.VK_UP)){
            y-=5;
        }
        if(getScreenFactory().getGame().getKeyboardListener().isKeyTyped(KeyEvent.VK_DOWN)){
            y+=5;
        }

        if (y<=upperBoundary){
            y=upperBoundary;
        }
        if (y>=bottomBoundary-height){
            y=bottomBoundary-height;
        }
        if (x<=leftBoundary){
            x=leftBoundary;
        }
        if (x>=rightBoundary-width){
            x=rightBoundary-width;
        }

    }

    @Override
    public void onDraw(Graphics2D g2d) {
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(x,y,width,height);
        g2d.drawLine(leftBoundary,upperBoundary,rightBoundary,upperBoundary);
        g2d.drawLine(rightBoundary,upperBoundary,rightBoundary,bottomBoundary);
        g2d.drawLine(rightBoundary,bottomBoundary,leftBoundary,bottomBoundary);
        g2d.drawLine(leftBoundary,bottomBoundary,leftBoundary,upperBoundary);
    }
}
