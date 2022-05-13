package com.example.minesweeper_android;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Cell>cells;
    private int size;

    public Grid(int size){
        this.size = size;
        cells = new ArrayList<>();

        for(int i = 0;i<size*size;i++){
            cells.add(new Cell(Cell.BLANK));
        }
    }

}
