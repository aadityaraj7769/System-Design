package src.main.tictactoe;

public class Board {
    private Cell[][] board;

    int size;

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];

        for(int i = 0; i<size; i++) {
            for(int j = 0; j<size; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    private boolean checkWinner(int row, int col, PlayingSymbol symbol) {
       // Row Match
        boolean rowMatch = true;

        for(int j = 0; j<size; j++) {
            if(board[row][j] == null || !(board[row][j].getSymbol().getSymbol() == symbol.getSymbol())) {
                rowMatch = false;
                break;
            }
        }
        if(rowMatch) return true;

        // Column Match
        boolean colMatch = true;

        for(int i = 0; i<size; i++) {
            if(board[i][col] == null || !(board[i][col].getSymbol().getSymbol() == symbol.getSymbol())) {
                System.out.println("Column does not match");
                colMatch = false;
                break;
            }
        }
        if(colMatch) return true;

        // Check Main Diagonal
        if(row == col) {
            boolean diagonalMatch = true;
            for(int i = 0; i < size; i++) {
                if(board[i][i].getSymbol() == null || !(board[i][i].getSymbol().getSymbol()==symbol.getSymbol())) {
                    diagonalMatch = false;
                    break;
                }
            }
            if(diagonalMatch) {
                return true;
            }
        }

        // Check Anti-Diagonal
        if(row + col == size - 1) {
            boolean antiDiagonalMatch = true;
            for(int i = 0; i < size; i++) {
                if(board[i][size - 1 - i].getSymbol() == null ||
                    !(board[i][size - 1 - i].getSymbol().getSymbol()==symbol.getSymbol())) {
                    antiDiagonalMatch = false;
                    break;
                }
            }
            if(antiDiagonalMatch) {
                return true;
            }
        }

        return false;
    }

    public boolean validateMove(int row, int col) {
        if(row >= 0 && row <= 2 && col >= 0 && col <= 2) return true;
        return false;
    }

    private void printMove() {
        for(int i = 0; i<size; i++) {
            for(int j = 0; j<size; j++) {
                System.out.print(board[i][j].getSymbol().getSymbol() + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int i, int j, PlayingSymbol symbol) {
        board[i][j].setSymbol(symbol);
        System.out.println("Current State of TicTacToe: ");
        printMove();

        if(checkWinner(i, j, symbol)) {
            return true;
        }
        return false;
    }
}
