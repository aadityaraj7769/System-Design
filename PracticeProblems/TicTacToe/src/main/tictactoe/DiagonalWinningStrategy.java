package src.main.tictactoe;

public class DiagonalWinningStrategy implements WinningStrategy {
  @Override
  public boolean checkWinner(int row, int col, Board board, Symbol symbol) {
    int size = board.getSize();

    // Check Diagonal
    if (row == col) {
      boolean diagonalMatch = true;
      for (int i = 0; i < size; i++) {
        Cell cell = board.getCell(i, i);
        if (cell.getSymbol() == null || !(cell.getSymbol().equals(symbol))) {
          diagonalMatch = false;
          break;
        }
      }
      if (diagonalMatch) {
        return true;
      }
    }

    // Check Anti-Diagonal
    if (row + col == size - 1) {
      boolean antiDiagonalMatch = true;
      for (int i = 0; i < size; i++) {
        Cell cell = board.getCell(i, size-1-i);
        if (cell.getSymbol() == null || !(cell.getSymbol().equals(symbol))) {
          antiDiagonalMatch = false;
          break;
        }
      }
      if (antiDiagonalMatch) {
        return true;
      }
    }

    return false;
  }
}
