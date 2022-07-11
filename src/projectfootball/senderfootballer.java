/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfootball;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author mo
 */
public class senderfootballer extends Agent{
     String[] footballers = Data.footballers;
    String[] agents = Data.agaents;
    String[] information =  Data.information;
     @Override
    protected void setup() {
        System.out.println("senderfootballer start");
        for (int i = 0; i < footballers.length; i++) {
            ACLMessage acl = new ACLMessage(ACLMessage.INFORM);
            acl.addReceiver(new AID(agents[i], false));
            acl.setContent(information[i]);
            send(acl);
            ACLMessage acl2 = new ACLMessage(ACLMessage.INFORM);
            acl2.addReceiver(new AID(agents[i], false));
            acl2.setContent(information[i]);
            send(acl2);
        }
    }

}
