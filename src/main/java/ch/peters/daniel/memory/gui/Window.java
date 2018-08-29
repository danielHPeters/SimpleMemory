package ch.peters.daniel.memory.gui;

/**
 * GUI window interface.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public interface Window extends Element {
  void open();

  void close();

  void setSize(int width, int height);
}
