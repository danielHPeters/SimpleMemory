package ch.peters.daniel.memory.models;

import java.util.UUID;

/**
 * Entity base model class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Entity {
  private UUID id;

  public Entity(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }
}
