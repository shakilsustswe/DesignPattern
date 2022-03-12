package templatepattern;

abstract class NPC {

    abstract void go();

    abstract void stop();

    abstract void jump();

    abstract void turn();

    final void GO() {
        go();

    }

    final void STOP() {
        stop();
    }

    final void JUMP() {
        jump();

    }

    final void TURN() {
        turn();
    }

}
