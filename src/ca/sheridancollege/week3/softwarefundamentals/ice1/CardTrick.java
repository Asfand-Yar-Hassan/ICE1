package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
import java.util.*;
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random ran=new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(ran.nextInt(13)+1);
            c.setSuit(Card.SUITS[ran.nextInt(3)]);
            magicHand[i]=c;
        }

        //insert code to ask the user for Card value and suit, create their card
       
        // and search magicHand here
        //Then report the result here
    }

}
