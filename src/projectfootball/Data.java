/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfootball;

import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mo
 */
public class Data extends Agent {

    //////////////////////////
    static jade.core.Runtime r = jade.core.Runtime.instance();
    static Profile p = new ProfileImpl();
    static ContainerController main1 = r.createMainContainer(p);

    //main function tne begin function of application run the Agent of Data class;
    public static void main(String[] args) throws StaleProxyException {

        AgentController Data = main1.createNewAgent("Data", "projectfootball.Data", null);
        Data.start();
    }

    @Override
    protected void setup() {
        try {
            runAgent();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // create central agent of the application
        try {
            AgentController Main = main1.createNewAgent("Main", "test.Main", null);
            Main.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        try {
            showResualt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void runAgent() throws StaleProxyException, InterruptedException {
        try {
            AgentController footballer1 = main1.createNewAgent("footballer1", "projectfootball.footballer1", null);
            footballer1.start();
            AgentController footballer2 = main1.createNewAgent("footballer2", "projectfootball.footballer2", null);
            footballer2.start();
            AgentController footballer3 = main1.createNewAgent("footballer3", "projectfootball.footballer3", null);
            footballer3.start();
            AgentController footballer4 = main1.createNewAgent("footballer4", "projectfootball.footballer4", null);
            footballer4.start();
            AgentController footballer5 = main1.createNewAgent("footballer5", "projectfootball.footballer5", null);
            footballer5.start();
            AgentController footballer6 = main1.createNewAgent("footballer6", "projectfootball.footballer6", null);
            footballer6.start();
            AgentController footballer7 = main1.createNewAgent("footballer7", "projectfootball.footballer7", null);
            footballer7.start();
            AgentController footballer8 = main1.createNewAgent("footballer8", "projectfootball.footballer8", null);
            footballer8.start();
            AgentController footballer9 = main1.createNewAgent("footballer9", "projectfootball.footballer9", null);
            footballer9.start();
            AgentController footballer10 = main1.createNewAgent("footballer10", "projectfootball.footballer10", null);
            footballer10.start();
            AgentController footballer11 = main1.createNewAgent("footballer11", "projectfootball.footballer11", null);
            footballer11.start();
            AgentController footballer12 = main1.createNewAgent("footballer12", "projectfootball.footballer12", null);
            footballer12.start();
            AgentController footballer13 = main1.createNewAgent("footballer13", "projectfootball.footballer13", null);
            footballer13.start();
            AgentController footballer14 = main1.createNewAgent("footballer14", "projectfootball.footballer14", null);
            footballer14.start();
            AgentController footballer15 = main1.createNewAgent("footballer15", "projectfootball.footballer15", null);
            footballer15.start();
            AgentController footballer16 = main1.createNewAgent("footballer16", "projectfootball.footballer16", null);
            footballer16.start();
            AgentController senderfootballer = main1.createNewAgent(" senderfootballer", "Projectfootball.senderfootballer", null);
            senderfootballer.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }

        display();
        display();
        display();
        display();
        showResualt();
    }
    static String[] teams = {"footballer1", "footballer2", "footballer3", "footballer4", "footballer5", "footballer6", "footballer7", "footballer8", "footballer9", "footballer10", "footballer11", "footballer12", "footballer13", "footballer14", "footballer15", "footballer16"};
    static String[] playgrounds = {"almainia", "america", "stade", "rades", "egypt", "maghrep", " elmhala", "emarat", "manshster", "uitedStudium", "anfeld", "elslam", "Elarab", "cairo", "bernabio", "chinia"};
    static String[] referees = {"tyam", "eyad", "mansour", "sondos", "ibrahim", "mary", "heba", "ali", "saad", "marwan", "syed", "sanad", "mohamed", "omer", "sarkan", "mart"};
    static List<String> list = Arrays.asList(teams);
    static String[] winers = new String[8];
    static String[] footballers = new String[15];
    static String[] information = new String[15];
    static String[] agaents = new String[15];
    static Integer[] score = {0, 1, 2, 3, 4, 5, 6};
    static String[] allScores = new String[15];

    static String getReferee() {
        int ran = random(referees.length);
        String refree = referees[ran];
        referees = removeTheElement(referees, ran);
        return refree;
    }

    static String getPlayground() {
        int ran = random(playgrounds.length);
        String ground = playgrounds[ran];
        playgrounds = removeTheElement(playgrounds, ran);
        return ground;
    }
    // function to return random number of a specific range[0 - mod];

    static int random(int mod) {
        Random random = new Random();
        int l = (random.nextInt());
        if (l < 0) {
            l = l * -1;
        }
        l = l % mod;
        return l;
    }
    // function to remove an element from array with index;

    static String[] removeTheElement(String[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {

            return arr;
        }
        // function to remove an element from array with the element;
        String[] anotherArray = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    // function to remove an element from array with the element;
    static String[] removeElements(String[] input, String deleteMe) {
        List result = new LinkedList();

        for (String item : input) {
            if (!deleteMe.equals(item)) {
                result.add(item);
            }
        }
        result.toArray(input);
        return input;
    }
    // in used as an index in the allScores[] in score function;
    static int in = 0;

    // score function generate the score of the matches and return the winner;
    static String score(String footbaler1, String footballer2) {
        int a1 = random(score.length);
        int a2 = random(score.length);
        if (a1 == a2) {
            a2++;
        }
        if (a1 < a2) {
            allScores[in] = footbaler1 + " lose from " + footballer2 + "  " + a2 + "-" + a1;
            JOptionPane.showMessageDialog(new JFrame(), allScores[in]);
            in++;
            return footballer2;
        } else {
            allScores[in] = footballer2 + " lose from " + footbaler1 + "  " + a1 + "-" + a2;
            JOptionPane.showMessageDialog(new JFrame(), allScores[in]);
            in++;
            return footbaler1;
        }

    }

    // function run the all function in this class and show the chart of matches and the winners and all data about the matches;
    static int m = 0;

    public static void display() {
        Collections.shuffle(list);
        list.toArray(teams);
        int j = 0;
        for (int i = 1; i < teams.length; i++) {
            String z = (teams[i - 1] + " vs " + teams[i] + ", the ground is " + getPlayground() + ", the referee : " + getReferee() + ", start now: ");
            System.out.println(z);
            footballers[m] = teams[i - 1];
            information[m] = z;
            agaents[m] = teams[i];
            String winer = score(teams[i - 1], teams[i]);
            System.out.println(winer);
            winers[j] = winer;
            j++;
            m++;
            i++;

        }
        System.out.println("\n");
        teams = winers;
        int length = winers.length;
        if (length == 1) {
            System.out.println("the champion is: " + winers[0]);
            JOptionPane.showMessageDialog(new JFrame(), "the champion is: " + winers[0]);
        }
        winers = new String[length / 2];
    }

    // function used to show all matches resault after 10 seconds;
    public static void showResualt() throws InterruptedException {
        for (int i = 0; i < allScores.length; i++) {
            System.out.println(allScores[i]);
        }
        JOptionPane.showMessageDialog(new JFrame(), allScores, "Champions league Finished : ", JOptionPane.INFORMATION_MESSAGE);
    }

}
