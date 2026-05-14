package src.main.tictactoe;

public interface WinningStrategy {
  boolean checkWinner(int row, int col, Board board, Symbol symbol);
}
