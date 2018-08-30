/**
 * Created by gjames on 3/13/2017.
 */

import java.util.*;

public class Deal {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: Deal hands cards");
            return;
        }
        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);

        // Make a normal 52-card deck.
        String[] suit = new String[]{ "♣", "♥", "♦", "♠"};
        String[] rank = new String[]{ " A", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", " J", " Q", " K"};
        List<String> deck = new ArrayList<>();
        for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck.add(rank[j] + suit[i]);
			}
		}

        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }
     //   List<Person> roster = Person.createRoster();

        for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<>(handView);
        handView.clear();
        return hand;
    }
}