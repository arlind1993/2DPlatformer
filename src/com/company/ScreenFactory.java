package com.company;

public class ScreenFactory {
    public final Game game;
    private Screen screen;

    public ScreenFactory(Game game){
        this.game=game;
    }

    void showScreen(Screen screen){
        this.screen=screen;
        this.screen.onCreate();
    }

    public Screen getCurrentScreen() {
        return screen;
    }

    public Game getGame() {
        return game;
    }
}
