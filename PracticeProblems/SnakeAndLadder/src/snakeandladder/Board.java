package src.snakeandladder;

import java.util.HashMap;


public class Board {
  private int size;
  private HashMap<Integer, Jump> jumps;

  public Board(int s) {
    size = s*s;
    jumps = new HashMap<>();

    jumps.put(1, new Jump(1, 38));
    jumps.put(4, new Jump(4, 14));
    jumps.put(9, new Jump(9, 31));
    jumps.put(17, new Jump(17, 7));
    jumps.put(21, new Jump(21, 42));
    jumps.put(28, new Jump(28, 84));
  }

  public int getFinalPosition(int curPosition, int diceValue, String player) {
    int finalPosition;
    if(jumps.containsKey(curPosition + diceValue)) {
      finalPosition = jumps.get(curPosition + diceValue).getEnd();
    }
    else {
      finalPosition = curPosition + diceValue;
    }
    return finalPosition;
  }

  public boolean isValidMove(int curPos, int diceValue) {
    int finalPos = curPos + diceValue;

    if(finalPos > size) return false;
    if(jumps.containsKey(curPos + diceValue)) {
      finalPos = jumps.get(curPos + diceValue).getEnd();
    }
    if(finalPos <= size) return true;

    return false;
  }

  public boolean isWinningPosition(int pos) {
    if(pos == size) return true;
    return false;
  }
}
