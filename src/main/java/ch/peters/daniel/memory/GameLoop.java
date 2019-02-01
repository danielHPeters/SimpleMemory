package ch.peters.daniel.memory;

/**
 * GameLoop class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class GameLoop {
  private GameState state;

  public GameLoop(GameState state) {
    this.state = state;
  }

  public void run() {
    state.setRunning(true);

    while (state.isRunning()) {
      // Update gui and game logic.
    }
  }
}
