package src.main.tictactoe;

public class Board {
    private Cell[][] board;

    private int size;

    public Board(int size) {
        this.size = size;
        board = new Cell[size][size];

        for(int i = 0; i<size; i++) {
            for(int j = 0; j<size; j++) {
                board[i][j] = new Cell(i, j);
            }
        }
    }

    public int getSize() {
        return size;
    }

    private boolean checkWinner(int row, int col, Symbol symbol) {
       // Row Match
        boolean rowMatch = true;

        for(int j = 0; j<size; j++) {
            if(board[row][j].getSymbol() == null || !(board[row][j].getSymbol().equals(symbol))) {
                rowMatch = false;
                break;
            }
        }
        if(rowMatch) return true;

        // Column Match
        boolean colMatch = true;

        for(int i = 0; i<size; i++) {
            if(board[i][col].getSymbol() == null || !(board[i][col].getSymbol().equals(symbol))) {
                colMatch = false;
                break;
            }
        }
        if(colMatch) return true;

        // Check Main Diagonal
        if(row == col) {
            boolean diagonalMatch = true;
            for(int i = 0; i < size; i++) {
                if(board[i][i].getSymbol() == null || !(board[i][i].getSymbol().equals(symbol))) {
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
                if(board[i][size - 1 - i].getSymbol() == null || !(board[i][size - 1 - i].getSymbol().equals(symbol))) {
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
        if(row >= 0 && row < size && col >= 0 && col < size && (board[row][col].isEmpty())) return true;
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

    public boolean placeMove(int i, int j, Symbol symbol) {
        board[i][j].setSymbol(symbol);
        System.out.println("Current State of TicTacToe: ");
        displayBoard();

        if(checkWinner(i, j, symbol)) {
            return true;
        }
        return false;
    }
}
