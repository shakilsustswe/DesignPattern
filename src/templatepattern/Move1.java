package templatepattern;

public class Move1 extends NPC {

    @Override
    void go() {
        System.out.print("M1 go");
    }

    @Override
    void stop() {
        System.out.print(" M1 stop");
    }

    @Override
    void jump() {
        System.out.println(" M1 jump");
    }

    @Override
    void turn() {
        System.out.print(" M1 turn");
    }

}
