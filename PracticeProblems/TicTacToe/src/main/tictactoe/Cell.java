package src.main.tictactoe;

public class Cell {
  private int row;
  private int column;

  private Symbol symbol;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
    this.symbol = null;
  }

  public void setSymbol(Symbol symbol) {
    this.symbol = symbol;
  }

  public Symbol getSymbol() {
    return symbol;
  }

  public boolean isEmpty() {
    if(symbol == null) return true;
    return false;
  }
}
