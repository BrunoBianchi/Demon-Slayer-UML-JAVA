package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public class FinalSelection extends Event
{
    private List<String> approved = new ArrayList<String>();
    private Step firstStep;
    public Step getFirstStep() {
        return firstStep;
    }

    public Step setFirstStep(Step firstStep) {
        this.firstStep = firstStep;
        return this.firstStep;
    }

    /**
     * Configures the first step and automatically chains the next steps.
     *
     * @param steps Varargs of steps to be added to the fight.
     */
    public void addSteps(Step... steps) {
        if (steps.length == 0)
            return; // No steps to add

        this.firstStep = steps[0]; // Set the first step
        Step currentStep = this.firstStep;

        // Chain the subsequent steps
        for (int i = 1; i < steps.length; i++) {
            currentStep = currentStep.setNext(steps[i]);
        }
    }

    public void execute() {
        Step currentStep = firstStep; // Start with the first step
        int stepCount = 1;
        while (currentStep != null) {
            System.out.println("Step " + stepCount + ": " + currentStep.toString());
            currentStep = currentStep.getNext(); // Move to the next step
            stepCount++;
        }

    }
    public List<String> getApproved() {
        return approved;
    }

    public void addApprovred(Human approved) {
        this.getApproved().add(approved.getName());
    }
    
    
}
