package src.main.tictactoe;

public class Player {
  private String playerId;
  private String playerName;
  private PlayingSymbol _playingSymbol;

  public Player(String id, String name, PlayingSymbol symbol) {
    playerId = id;
    playerName = name;
    _playingSymbol = symbol;
  }

  public String getPlayerName() {
    return playerName;
  }

}
