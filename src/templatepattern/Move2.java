
package templatepattern;


public class Move2 extends NPC{

    @Override
    void go() {
        System.out.print("M2 go");
    }

    @Override
    void stop() {
        System.out.print(" M2 stop");
    }

    @Override
    void jump() {
        System.out.println(" M2 jump");
    }

    @Override
    void turn() {
        System.out.print(" M2 turn");
    }
    
}
