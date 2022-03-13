package observer_Pattern;

public class ObserverMain {

    public static void main(String args[]) {
        Subject subject = new Subject();

        new StringObserver(subject);
        new OctalObserver(subject);
        new HexaDecimal(subject);

        System.out.println("State change: 45");
        subject.setState(45);
        System.out.println("State change: 150");
        subject.setState(150);
    }
}
