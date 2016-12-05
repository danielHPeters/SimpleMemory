package com.memory;

import com.memory.gameobjects.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 05.12.2016.
 */
public class GameLoop {

    /**
     * List with all the cards
     */
    private List<Card> cards;

    /**
     *
     */
    private Card selectedCard;

    private boolean running;

    public GameLoop() {

        this.cards = new ArrayList<>();
        this.running = true;
        this.selectedCard = null;
        runGame();
        
    }

    /**
     *
     */
    private void runGame() {

        while (this.running) {

            cards.forEach(card -> {
                if (!card.isRemoved()) {
                    card.display();
                }
            });

            if (this.selectedCard != null && this.cards.get(0).matches(selectedCard)) {

            }
        }
    }

}
