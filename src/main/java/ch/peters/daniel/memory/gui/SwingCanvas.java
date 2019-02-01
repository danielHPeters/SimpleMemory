package ch.peters.daniel.memory.gui;

import javax.swing.JPanel;
import java.awt.*;

/**
 * Swing canvas implementation.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class SwingCanvas extends JPanel implements Canvas {
  @Override
  public void render() {
    repaint();
  }

  @Override
  public void appendChild(Element childElement) {
    if (childElement instanceof Component) {
      add((Component) childElement);
    }
  }
}
