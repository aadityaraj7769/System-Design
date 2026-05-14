package src.main.tictactoe;

public class Player {
  private String playerId;
  private String playerName;
  private Symbol playingSymbol;

  public Player(String id, String name, Symbol symbol) {
    playerId = id;
    playerName = name;
    playingSymbol = symbol;
  }

  public String getPlayerName() {
    return playerName;
  }

  public Symbol getPlayingSymbol() {
    return playingSymbol;
  }

}
