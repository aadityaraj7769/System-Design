package src.main.tictactoe;

public class RowWinningStrategy implements WinningStrategy{

  @Override
  public boolean checkWinner(int row, int col, Board board, Symbol symbol) {
    boolean rowMatch = true;
    int size = board.getSize();

    for(int j = 0; j<size; j++) {
      Cell cell = board.getCell(row, j);
      if(cell.getSymbol() == null || !(cell.getSymbol().equals(symbol))) {
        rowMatch = false;
        break;
      }
    }
    if(rowMatch) return true;
    return false;
  }
}
