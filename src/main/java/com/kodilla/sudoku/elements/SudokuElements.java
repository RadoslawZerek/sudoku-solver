package com.kodilla.sudoku.elements;

public class SudokuElements {
    private int value;
    public static final int EMPTY = -1;

    public SudokuElements(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
