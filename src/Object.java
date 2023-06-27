public class Object {
    public static void main(String[] args) {
        System.out.println(Card.height);

        Card c1=new Card();
        c1.kind="H";
        c1.number=26;
        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println(c1.width);
    }
}
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height=250;

}

