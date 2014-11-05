/* Build the deck numbered 1 -13
 * Shuffle the deck
 * Play through the game
 * print the card that is drawn and the state of the board along with
 * the # of discards
 * Display Won or lost
 * 10 slots
 * First goal: Get game to play
 * Second: optimize

 * Initialze array of 52
 * Shuffle the array
 * Discard 3 cards always for naive method */


import java.util.*;
import java.io.*;

class athena {

  public static void main(String [ ] args)
  {
    ArrayList<Integer> deckOfCards = new ArrayList<Integer>(); // Contains 52 cards
    ArrayList<Integer> slots = new ArrayList<Integer>();

    // I want to increase every 4 cards by one more than the last 4
    for (int i = 1; i <= 13; i++)
    {
      for (int rank = 1; rank <= 4; rank++)
      {
        deckOfCards.add(i);
      }

    }

    for(int i = 0; i < 52; i++)
    {
      System.out.println("Cards in the deck before shuffle: " + deckOfCards.get(i));
    }
    //Shuffle up the deck
    Collections.shuffle(deckOfCards);

    for(int i = 0; i < 52; i++)
    {
      System.out.println("Cards in the deck after shuffle: " + deckOfCards.get(i));
    }

    for(int i = 0; i < 52; i++)
    {
      if (deckOfCards.get(i) == 13 || deckOfCards.get(i) ==12 || deckOfCards.get(i) == 11)
      {
        deckOfCards.remove(i);
    }

    else
    {
        slots.add(deckOfCards.get(i), deckOfCards.get(i));
    }
    System.out.println("Card # in slot: " + slots.get(i));
    }
    //Once everything is initialzed to the correct value, I will need to shuffle the array
    //Once everything is suffled, I will defined the 10 slots.
    //Draw a card: Hardcode which cards to automaticallly discard.
    //The cards that will not be discarded need to be assigned a particular slot
    //If less than 6 cards have been discraded and all slots are full, you win the game
    //Otherwise, you lose
  }
}
