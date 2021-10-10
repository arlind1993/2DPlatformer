package com.company;

import javax.swing.*;

public class Game {
    private final int windowWidth;
    private final int windowHeight;

    private final JFrame window=new JFrame();
    private final ScreenFactory screenFactory;
    private final GameThread gameThread;
    private final KeyboardListener keyboardListener;
    private final MousePadListener mousePadListener;
    public Game(int windowWidth, int windowHeight, String windowTitle){
        window.setTitle(windowTitle);
        window.setSize(windowWidth,windowHeight);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setFocusable(true);
        window.setLocationRelativeTo(null);

        this.windowWidth=windowWidth;
        this.windowHeight=windowHeight;

        screenFactory=new ScreenFactory(this);
        gameThread=new GameThread(this);
        keyboardListener=new KeyboardListener();
        mousePadListener=new MousePadListener();

        window.add(gameThread);
        window.addKeyListener(keyboardListener);
        window.addMouseListener(mousePadListener);

        window.setVisible(true);

        new Thread(gameThread).start();
    }

    public KeyboardListener getKeyboardListener() {
        return keyboardListener;
    }

    public MousePadListener getMousePadListener() {
        return mousePadListener;
    }

    public ScreenFactory getScreenFactory() {
        return screenFactory;
    }

    public JFrame getWindow() {
        return window;
    }

    public int getWindowHeight() {
        return windowHeight-40;
    }

    public int getWindowWidth() {
        return windowWidth-15;
    }
}
