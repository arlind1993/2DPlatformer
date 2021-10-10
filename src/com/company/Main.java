package com.company;

public class Main {
    private Game game;

    Main(){
        game=new Game(815,640,"Hollow Knight");
        game.getScreenFactory().showScreen(new MyScreen(game.getScreenFactory()));
    }
    public static void main(String []args){
        new Main();
    }
}
