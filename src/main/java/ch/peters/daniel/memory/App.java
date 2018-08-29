package ch.peters.daniel.memory;

import ch.peters.daniel.memory.gui.Canvas;
import ch.peters.daniel.memory.gui.SwingCanvas;
import ch.peters.daniel.memory.gui.SwingWindow;
import ch.peters.daniel.memory.gui.Window;

import javax.swing.*;

/**
 * Main application class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class App {
  private Canvas canvas;
  private Window window;

  public App() {
    canvas = new SwingCanvas();
    window = new SwingWindow();
  }

  public void initAndShowGui() {
    window.setSize(500, 500);
    window.appendChild(canvas);
    window.open();
  }


  /**
   * Starts the game.
   *
   * @param args Command line Arguments
   */
  public static void main(String[] args) {
    var program = new App();
    SwingUtilities.invokeLater(program::initAndShowGui);
  }
}
