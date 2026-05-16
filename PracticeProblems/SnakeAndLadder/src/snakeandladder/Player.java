package src.snakeandladder;

public class Player {
  private String playerId;
  private String playerName;
  private int position;

  public Player(String id, String name) {
    playerId = id;
    playerName = name;
    position = 0;
  }

  public int getPosition() {
    return position;
  }

  public void moveTo(int pos) {
    position = pos;
  }

  public String getPlayerName() {
    return playerName;
  }

  public String getPlayerId() {
    return playerId;
  }
}
