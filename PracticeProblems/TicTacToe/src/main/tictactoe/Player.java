package src.main.tictactoe;

public class Player {
  private String playerId;
  private String playerName;
  private Symbol _playingSymbol;

  public Player(String id, String name, Symbol symbol) {
    playerId = id;
    playerName = name;
    _playingSymbol = symbol;
  }

  public String getPlayerName() {
    return playerName;
  }

  public Symbol getPlayingSymbol() {
    return _playingSymbol;
  }

}
