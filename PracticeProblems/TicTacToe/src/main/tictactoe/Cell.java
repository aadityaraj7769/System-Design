package src.main.tictactoe;

public class Cell {
  private int row;
  private int column;

  private PlayingSymbol symbol;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
    this.symbol = new PlayingSymbol();
  }

  public void setSymbol(PlayingSymbol symbol) {
    this.symbol = symbol;
  }

  public PlayingSymbol getSymbol() {
    return symbol;
  }
}
