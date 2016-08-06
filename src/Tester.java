
/**
 * <p>Title: Tester</p>
 *
 * <p>Description: </p>
 *
 * @author not attributable
 * 
 */
public class Tester
{
    public static void main(String []args)
    {
        Card c1 = new Card(18);
        Card c2 = new Card(19);
        Card c3 = new Card(20);
        Card c4 = new Card(21);
        PokerHand Card5 = new PokerHand(c1, c2, c3, c4);
        System.out.println(Card5.toString());
        System.out.println(Card5.fourOfAKind());
        System.out.println(Card5.flush());
        System.out.println(Card5.pair());
        System.out.println(Card5.threeOfAKind());
        System.out.println(Card5.lowCard());
        System.out.println(Card5.straight());
    }
}