package com.example.minesweeper_android;

public class Game {
    private Grid grid;

    public Game(int size) {
        grid =  new Grid(size);
    }

    public Grid getGrid() {
        return grid;
    }
}
