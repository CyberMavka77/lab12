package chainofresponsibility;

public class ATM {
    public static void main(String[] args) {
        Handler5 hand5 = new Handler5();
        Handler20 hand20 = new Handler20();
        Handler50 hand50 = new Handler50();

        hand50.setNext(hand20);
        hand20.setNext(hand5);

        hand50.process(125);
    }
}
