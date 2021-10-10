package com.company;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePadListener implements MouseListener {

    private int mouseX;
    private int mouseY;

    private boolean clicked;

    @Override
    public void mouseClicked(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        clicked=true;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseClicked(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        clicked=false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public boolean isMousePressed(){
        return true;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
}
