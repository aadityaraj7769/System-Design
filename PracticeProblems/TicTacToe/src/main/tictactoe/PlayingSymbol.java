package src.main.tictactoe;

public class PlayingSymbol {

  private char _symbol;
  public PlayingSymbol() {
    _symbol = '.';
  }

  public char getSymbol() {
    return _symbol;
  }

  public void setSymbol(char symbol) {
    _symbol = symbol;
  }
}
