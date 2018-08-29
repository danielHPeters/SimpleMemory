package ch.peters.daniel.memory.models;

import java.util.UUID;

/**
 * Card model class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Card extends Entity {
  private final String image;
  private boolean covered;
  private boolean removed;

  public Card(UUID id, String image) {
    super(id);
    this.image = image;
    this.covered = false;
    this.removed = false;
  }

  public Card(String image) {
    this(UUID.randomUUID(), image);
  }

  public void flip() {
    covered = !covered;
  }

  public boolean matches(Card other) {
    return image.equals(other.getImage());
  }

  public String getImage() {
    return image;
  }

  public boolean isCovered() {
    return covered;
  }

  public void setCovered(boolean covered) {
    this.covered = covered;
  }

  public boolean isRemoved() {
    return removed;
  }

  public void setRemoved(boolean removed) {
    this.removed = removed;
  }
}
