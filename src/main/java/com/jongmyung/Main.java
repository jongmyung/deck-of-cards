package com.jongmyung;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        DeckOfCards deckOfCards = new DeckOfCards();
        Scanner command = new Scanner(System.in);
        System.out.println("Let's play card game");
        boolean running = true;
        while (running) {
            System.out.println("Enter option(1:Shuffle Card, 2:Deal a card, 0:Exit): ");

            switch (command.nextLine()) {
                case "1":
                    System.out.println("Card Shuffle");
                    deckOfCards.shuffle();
                    break;
                case "2":
                    Card card = deckOfCards.dealOneCard();
                    if (card != null)
                        System.out.println("You got a " + card);
                    break;
                case "0":
                    System.out.println("Thank you for play the game.");
                    running = false;
                    break;
                default:
                    System.out.println("Wrong option entered. Try again");
                    break;
            }
        }
        command.close();
    }
}
