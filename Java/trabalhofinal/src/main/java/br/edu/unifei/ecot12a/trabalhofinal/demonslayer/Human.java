package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public class Human {
    private String name;
    private TypeHuman type;
    private int age;
    private boolean died;
    private int kills = 0;
    
    public int getKills() {
        return kills;
    }
    public void setKills(int kills) {
        this.kills = kills;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TypeHuman getHType() {
        return type;
    }
    public void setHType(TypeHuman type) {
        this.type = type;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isDied() {
        return died;
    }
    public void setDied(boolean died) {
        this.died = died;
    }
}
