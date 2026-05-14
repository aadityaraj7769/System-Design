package src.main.tictactoe;

import java.util.ArrayList;
import java.util.List;


public class Board {
    private Cell[][] board;
    private List<WinningStrategy> strategies;
    private int numberOfCellFilled;
    private int size;

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];
        numberOfCellFilled = 0;
        strategies = new ArrayList<>();
        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagonalWinningStrategy());

        for(int i = 0; i<size; i++) {
            for(int j = 0; j<size; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }

    private boolean checkWinner(int row, int col, Symbol symbol) {
       for(WinningStrategy strategy: strategies) {
           if(strategy.checkWinner(row, col, this, symbol)) {
               return true;
           }
       }
       return false;
    }

    private boolean isWithinBounds(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    private boolean isCellEmpty(int row, int col) {
        return board[row][col].isEmpty();
    }

    public boolean validateMove(int row, int col) {
        if(isWithinBounds(row, col) && isCellEmpty(row, col)) return true;
        return false;
    }

    private void displayBoard() {
        for(int i = 0; i<size; i++) {
            for(int j = 0; j<size; j++) {
                System.out.print(board[i][j].getSymbol() == null ? '.' : board[i][j].getSymbol());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        return numberOfCellFilled == (size * size);
    }

    public boolean placeMove(int i, int j, Symbol symbol) {
        board[i][j].setSymbol(symbol);
        numberOfCellFilled += 1;
        System.out.println("Current State of TicTacToe: ");
        displayBoard();

        if(checkWinner(i, j, symbol)) {
            return true;
        }
        return false;
    }
}
