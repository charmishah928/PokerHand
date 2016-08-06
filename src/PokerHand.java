

/**
 * <p>Title: The PokerHand class</p>
 *
 * <p>Description: This class represents a four card hand of cards.
 * A cards in a poker hand can make four of a kind, a flush, three of a
 * kind, two pair, a pair or a straight.</p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * @author Charmi Shah
 * @version 1.0
 */
public class PokerHand
{
    // instance variables
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;

    /**
     * parameterized constructor --
     * this constructor puts 4 cards into the poker hand
     * @param c1 a reference to a Card object
     * @param c2 a reference to a Card object
     * @param c3 a reference to a Card object
     * @param c4 a reference to a Card object
     */
    public PokerHand(Card c1, Card c2, Card c3, Card c4)
    {
        card1 = c1;
        card2 = c2;
        card3 = c3;
        card4 = c4;
    }

    /**
     * fourOfAKind method --
     * this method determines if the four cards have the same value
     * @return true if four of a kind exists, false otherwise
     */
    public String fourOfAKind()
    {
        int vOfcard1 = card1.getValue();
        int vOfcard2 = card2.getValue();
        int vOfcard3 = card3.getValue();
        int vOfcard4 = card4.getValue();
       
        if(vOfcard1 == vOfcard2 && vOfcard2 == vOfcard3 && vOfcard3 == vOfcard4)
            return "True: Four of a kind";
        else
            return "False: Not four of a kind";
            
            
    }

    /**
     * threeOfAKind method --
     * this method determines the different ways that three of a kind may exist with 4 cards
     * @return true if three of a kind exists, false otherwise
     */
    public boolean threeOfAKind()
    {
        if(card1.getValue()==card2.getValue() && card1.getValue()==card3.getValue())
            return true;
        else if(card1.getValue()==card2.getValue()&&card1.getValue()==card4.getValue())
            return true;
        else if(card1.getValue()==card3.getValue() && card1.getValue()==card4.getValue())
            return true;
        else if(card2.getValue()==card3.getValue()&&card2.getValue()==card4.getValue())
            return true;
        else 
            return false;
                    
        
    }

    /**
     * twoPair method --
     * this method determines if there are two different pairs in the 4 cards
     * @return true if two pair exist, false otherwise
     */
    public boolean twoPair()
    {
        if(card1.equalValue(card2)&&card3.equalValue(card4))
            return true;
        else if(card1.equalValue(card3)&&card2.equalValue(card4))
            return true;
        else if(card1.equalValue(card4)&&card2.equalValue(card3))
            return true;
        else 
            return false;
    }

    /**
     * flush method --
     * this method determines if the four cards are of the same suit
     * @return true if a flush exists, false otherwise
     */
    public String flush()
    {
        String sOfcard1 = card1.getSuit();
        String sOfcard2 = card2.getSuit();
        String sOfcard3 = card3.getSuit();
        String sOfcard4 = card4.getSuit();
        if(sOfcard1 == sOfcard2 && sOfcard2 == sOfcard3 && sOfcard3 == sOfcard4)
            return "True: Flush";
        else
            return "False: Not a Flush";
    }

    /**
     * pair method --
     * this method determines the different pairs that may exist with 4 cards
     * @return true if a pair exists, false otherwise
     */
    public boolean pair()
    {
        
        if(card1.equalValue(card2)||card1.equalValue(card3)||card1.equalValue(card4)||card2.equalValue(card3)||card2.equalValue(card4)||card3.equalValue(card4))
             return true;
        else
            return false;
    }

    /**
     * lowCard method --
     * this method finds the card with the lowest value -- if two cards have the same value, it should return
     * the first card it finds with that value
     * @return a reference to the card with the lowest value
     */
    public Card lowCard()
    {
        int vOfcard1 = card1.getValue();
        int vOfcard2 = card2.getValue();
        int vOfcard3 = card3.getValue();
        int vOfcard4 = card4.getValue();
        if(vOfcard1 == vOfcard2 || vOfcard1 == vOfcard3 || vOfcard1 == vOfcard4)
            return card1;
        else if(vOfcard2 == vOfcard3 && vOfcard2 == vOfcard4)
            return card2;
        else if(vOfcard3 == vOfcard4)
            return card3;
        else if(vOfcard1 < vOfcard2 && vOfcard1 < vOfcard3 && vOfcard1 < vOfcard4)
            return card1;
        else if(vOfcard2 < vOfcard1 && vOfcard2 < vOfcard3 && vOfcard2 < vOfcard4)
            return card2;
        else if(vOfcard3 < vOfcard1 && vOfcard3 < vOfcard2 && vOfcard3 < vOfcard4)
            return card3;
        else 
            return card4;
    }

    /**
     * straight method --
     * this method determines if the poker hand has 4 cards in sequence
     * @return true if a straight exists, false otherwise
     */
    public String straight()
    {
        int vOfcard1 = card1.getValue();
        int vOfcard2 = card2.getValue();
        int vOfcard3 = card3.getValue();
        int vOfcard4 = card4.getValue();
        if(vOfcard1+1 == vOfcard2 && vOfcard2+1 == vOfcard3 && vOfcard3+1 == vOfcard4)
            return "True: Stright";
        else
            return "False: Not Stright";
    }

    /**
     * toString method
     * @return a reference to a String which contains the value and suit of each
     * of the 4 cards
     */
    public String toString()
    {
        return new String((card1.toString() + "\n" + card2.toString() + "\n" +
                card3.toString() + "\n" + card4.toString()));
    }
}
