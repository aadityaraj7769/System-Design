package src.main.tictactoe;

public class ColumnWinningStrategy implements WinningStrategy {

  @Override
  public boolean checkWinner(int row, int col, Board board, Symbol symbol) {
    boolean colMatch = true;

    for (int i = 0; i < board.getSize(); i++) {
      Cell cell = board.getCell(i, col);
      if (cell.getSymbol() == null || !(cell.getSymbol().equals(symbol))) {
        colMatch = false;
        break;
      }
    }
    if (colMatch) return true;
    return false;
  }
}
