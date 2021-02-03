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
       Card card=new Card();
       boolean found=false;
       
       Scanner input=new Scanner(System.in);
        System.out.println("Enter card value:");
       int val=input.nextInt();
       System.out.println("Enter suit:");
       String suit=input.next();
       card.setValue(val);
       card.setSuit(suit);
       
       // and search magicHand here
        for(int i=0;i<magicHand.length;i++){
        if (magicHand[i].getValue()==card.getValue()&&magicHand[i].getSuit()==card.getSuit())
        found= true;
        else found=false;
        }
        

        //Then report the result here
        if(found=true)
            System.out.println("Card is in the magic hand!");
        else System.out.println("Card is not in the magic hand!");
        
        //create luckyCard object
        Card luckyCard=new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit(Card.SUITS[2]);
        
        //loop to check if luckyCard is present in magic hand
        for(int i=0;i<magicHand.length;i++){
         if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
           {
               found = true;
               break;
           }
       }
      
       // display the result based on the search
       if(found)
           System.out.println("Lucky card found in magicHand");
       else
           System.out.println("Lucky card not found in magicHand");
        
        }
    }

}
