package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {

    boolean keys[]=new boolean[256];

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]=false;

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public boolean isKeyTyped(int key){
        return keys[key];
    }

    public boolean isKeyReleased(int key){
        return !keys[key];
    }
}
