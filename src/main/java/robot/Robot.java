/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

import java.util.ArrayList;

/**
 *
 * @author fikriyuwi
 */
public abstract class Robot<A> {
    // delay for each process/steps
    public int proccessingTime = 2000;
    // name of robot
    private A name;
    // array list of all steps
    private ArrayList<String> steps = new ArrayList<>();

    // constructor
    public Robot(A name) {
        this.name = name;
    }

    // getter name robot
    public String getName() {
        return String.valueOf(this.name);
    }

    // setter name robot
    public void setName(A name) {
        this.name = name;
    }
    
    // setter add new step in it
    public void addStep(String step) {
        this.steps.add(step);
    }
    
    // getter steps
    public ArrayList<String> getStep() {
        return this.steps;
    }
    
    // getter steps count or steps size
    public int getStepSize() {
        return this.steps.size();
    }
    
    // method to display starting program
    public void start() {
        System.out.println("[STARTING] Robot " + this.getName());
    }
    
    // abstract method for finished program
    public abstract void finish();
}
