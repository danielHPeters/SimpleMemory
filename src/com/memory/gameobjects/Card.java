package com.memory.gameobjects;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 28.11.2016.
 */
public class Card {

    /**
     * Name of the  card
     */
    private final String name;

    /**
     * Image GUI representation of the card
     */
    private final Image image;

    private final JButton button;

    private boolean flipped;

    /**
     * Default constructor.
     * Sets name and image of card object
     */
    public Card(String name, Image image) {
        this.name = name;
        this.image = image;
        this.flipped = false;
        this.button = new JButton();
    }

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    public JButton getButton() {
        return this.button;
    }

    /**
     * Flips the card
     */
    public void flip() {
        this.flipped = !this.flipped;
    }

    /**
     * Check if the card matches with the other selected card
     *
     * @param otherCard
     * @return
     */
    public boolean matches(Card otherCard) {

        boolean match = false;

        if (this.name.equals(otherCard.getName())) {
            match = true;
        }

        return match;
    }

}
