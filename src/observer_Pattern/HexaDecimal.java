/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_Pattern;

public class HexaDecimal extends Observer {

    public HexaDecimal(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex value: " + Integer.toHexString(subject.getState()));
    }
}
