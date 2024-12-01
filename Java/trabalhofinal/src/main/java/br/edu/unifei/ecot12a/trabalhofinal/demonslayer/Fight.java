package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public class Fight extends Event {
    private List<Object> winners = new ArrayList<>();
    private List<Object> losers = new ArrayList<>();
    private Step firstStep;

    public List<Object> getWinners() {
        return winners;
    }

    public void setWinners(List<Object> winners) {
        this.winners = winners;
    }

    public List<Object> getLosers() {
        return losers;
    }

    public void setLosers(List<Object> losers) {
        this.losers = losers;
    }

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

    /**
     * Applies the consequences of the fight:
     * - Adds +1 kill for winners.
     * - Marks losers as dead.
     */
    public void applyFightConsequences() {
        // Apply to winners
        for (Object winner : winners) {
            if (winner instanceof Human) {
                Human humanWinner = (Human) winner;
                humanWinner.setKills(humanWinner.getKills() + 1);
            } else if (winner instanceof Demon) {
                Demon demonWinner = (Demon) winner;
                demonWinner.setKills(demonWinner.getKills() + 1);
            }
        }

        // Apply to losers
        for (Object loser : losers) {
            if (loser instanceof Human) {
                Human humanLoser = (Human) loser;
                humanLoser.setDied(true);
            } else if (loser instanceof Demon) {
                Demon demonLoser = (Demon) loser;
                demonLoser.setDied(true);
            }
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

        // Apply consequences after execution
        applyFightConsequences();
    }
}
