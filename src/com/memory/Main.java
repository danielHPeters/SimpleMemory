package com.memory;

import javax.swing.*;

public class Main {

    /**
     * Canvas with cards
     */
    private MemoryCanvas canvas;

    /**
     * Window containing the game;
     */
    private MemoryWindow window;

    /**
     * Default constructor.
     * Initializes all game objects
     */
    public Main() {
        this.canvas = new MemoryCanvas();
        this.window = new MemoryWindow();
    }

    /**
     * Initializes the GUI
     */
    public void initAndShowGui() {
        this.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.window.setSize(500, 500);
        this.window.add(this.canvas);
        this.window.setVisible(true);
    }


    /**
     * Starts the game
     *
     * @param args Command line Arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        SwingUtilities.invokeLater(() -> program.initAndShowGui());
    }
}
