package templatepattern;

public class TemplatePattern {

    public static void main(String[] args) {

        /////Move1
        NPC npc = new Move1();
        npc.GO();
        npc.STOP();
        npc.TURN();
        npc.JUMP();

//          Move1 move1= new Move1();
//          move1.go();
//          move1.stop();
//          move1.jump();
//          move1.turn();
                   

        /////Move2 
        npc = new Move2();
        npc.GO();
        npc.STOP();
        npc.TURN();
        npc.JUMP();

    }

}
