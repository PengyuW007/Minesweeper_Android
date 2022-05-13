package com.example.minesweeper_android;

public class Cell {
    protected static final int BOMB = -1;
    protected static final int BLANK = 0;

    private int value;
    private boolean isRevealed;
    private boolean isFlagged;

    public Cell(int value) {
        this.value = value;
        this.isRevealed = false;
        this.isFlagged = false;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }
}
