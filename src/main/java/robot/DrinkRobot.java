/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

import robot.Robot;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fikriyuwi
 */
public class DrinkRobot<A> extends Robot implements Runnable{
//    make the drink iced or not
    private boolean makeItIced;
    
//    constructor
    public DrinkRobot(A name,boolean makeItIced) {
        super(name);
        this.makeItIced = makeItIced;
    }
    
//    declaration for abstract in super class
    @Override
    public void finish() {
        System.out.println("[FINISHED] Robot " + super.getName());
    }

    // getter makeItIced
    public boolean isMakeItIced() {
        return this.makeItIced;
    }

    // setter makeItIced
    public void setMakeItIced(boolean makeItIced) {
        this.makeItIced = makeItIced;
    }
    
    // method to display process putting ice
    public void putIce(int step) {
        System.out.println("Step " + (step+1) + " - Robot " + super.getName() + " - is putting some of ice...");
    }
    
    // method to display process putting straw
    public void putStraw(int step) {
        System.out.println("Step " + (step+1) + " - Robot " + super.getName() + " - is putting a straw...");
    }

    @Override
    // do process
    public void run() {
        int i;
        // display process starting
        try {
            this.start();
            Thread.sleep(this.proccessingTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
        }
        // display doing each steps
        for (i = 0; i < this.getStepSize(); i++) {
            try {
                System.out.println("Step " + (i+1) + " - Robot " + this.getName() + " - is " + this.getStep().get(i));
                Thread.sleep(this.proccessingTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // if make it iced then add ice and put straw
        if (makeItIced) {
            try {
                this.putIce(i);
                i++;
                Thread.sleep(this.proccessingTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.putStraw(i);
                Thread.sleep(this.proccessingTime);
            } catch (InterruptedException ex) {
                Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // display process is finished
        try {
            this.finish();
            Thread.sleep(this.proccessingTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
