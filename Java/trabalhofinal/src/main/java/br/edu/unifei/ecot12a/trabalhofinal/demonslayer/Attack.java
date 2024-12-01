package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class Attack extends Step {
    private String who;
    private String description;

    public Attack(String who, String description) {
        this.who = who;
        this.description = description;
    }

    public String getWho() {
        return who;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return who + ": " + description;
    }
}
