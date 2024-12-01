package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public class Demon<R extends Rank> extends Human{
    private int kills;
    private TypeHuman typeHuman;
    private boolean approvedByMuzan = false;
    private List<String> habilities = new ArrayList<String>();
    private String vulnerability;
    private Rank rank;
    private TypeDemon type;
    private String name;
    private int age;
    private boolean died = false;

    public TypeHuman getTypeHuman() {
        return typeHuman;
    }

    public void setTypeHuman(TypeHuman typeHuman) {
        this.typeHuman = typeHuman;
    }
    public boolean isDied() {
        return died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean loyalToMuzan;
    public boolean isLoyalToMuzan() {
        return loyalToMuzan;
    }

    public void setLoyalToMuzan(boolean loyalToMuzan) {
        this.loyalToMuzan = loyalToMuzan;
    }

    public TypeDemon getType() {
        return type;
    }

    public void setType(TypeDemon type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Demon(Class<R> rankClass) {
        try {
            this.rank = rankClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível instanciar o rank!", e);
        }
    }



    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public boolean isApprovedByMuzan() {
        return approvedByMuzan;
    }

    public void setApprovedByMuzan(boolean approvedByMuzan) {
        this.approvedByMuzan = approvedByMuzan;
    }

    public List<String> getHabilities() {
        return habilities;
    }

    public void setHabilities(List<String> habilities) {
        this.habilities = habilities;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

    public Rank getRank() {
        return rank;

    }

    public void evolve() {
        if(kills < 50) {
            this.rank = new NormalDemon();
        }else if(kills >= 50) {
            this.rank = new InferiorMoon();
        }else if(kills >= 50 && approvedByMuzan) {
            this.rank = new SuperiorMoon();
        }
    }

}
