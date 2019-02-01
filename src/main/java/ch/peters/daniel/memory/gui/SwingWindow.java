package ch.peters.daniel.memory.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Swing window implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class SwingWindow extends JFrame implements Window {
  @Override
  public void open() {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
  }

  @Override
  public void close() {
    dispose();
  }

  @Override
  public void appendChild(Element childElement) {
    if (childElement instanceof Component) {
      add((Component) childElement);
    }
  }
}
