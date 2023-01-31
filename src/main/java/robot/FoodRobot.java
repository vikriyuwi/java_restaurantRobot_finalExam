/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fikriyuwi
 * @param <A>
 */
public class FoodRobot<A> extends Robot implements Runnable{

//    constructor
    public FoodRobot(A name) {
        super(name);
    }
    
//    declaration for abstract in super class
    @Override
    public void finish() {
        System.out.println("[FINISHED] Robot " + super.getName());
    }
    
    // method to display putting spoon and fork
    public void putSpoonFork(int step) {
        System.out.println("Step " + (step+1) + " - Robot " + super.getName() + " - is putting spoon and fork");
    }

    @Override
    // do process
    public void run() {
        int i;
         // display process is starting
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
        // display process adding spoon and pork from method above
        try {
            this.putSpoonFork(i);
            Thread.sleep(this.proccessingTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(FoodRobot.class.getName()).log(Level.SEVERE, null, ex);
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
