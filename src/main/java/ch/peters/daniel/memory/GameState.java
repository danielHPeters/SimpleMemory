package ch.peters.daniel.memory;

import ch.peters.daniel.memory.models.Card;

import java.util.List;

/**
 * GameState class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class GameState {
  private List<Card> cards;
  private Card selectedCard;
  private boolean running;

  public GameState(List<Card> cards) {
    this.cards = cards;
    this.selectedCard = null;
    this.running = false;
  }

  public List<Card> getCards() {
    return cards;
  }

  public Card getSelectedCard() {
    return selectedCard;
  }

  public void setSelectedCard(Card selectedCard) {
    this.selectedCard = selectedCard;
  }

  public boolean isRunning() {
    return running;
  }

  public void setRunning(boolean running) {
    this.running = running;
  }
}
