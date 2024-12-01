package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Muzan muzan = Muzan.getInstance();

        Demon<InferiorMoon> kyogai = muzan.createDemon(InferiorMoon.class);
        kyogai.setName("Kyogai");
        kyogai.getRank().setPosition(6);
        kyogai.setType(new Bad());
        List<String> habilitiesKyogai = new ArrayList<String>();
        habilitiesKyogai.add("Controll Rooms");
        kyogai.setHabilities(habilitiesKyogai);
        kyogai.setLoyalToMuzan(true);
        kyogai.setHType(new Normal());

        Demon<SuperiorMoon> akaza = muzan.createDemon(SuperiorMoon.class);
        akaza.setName("Akaza");
        List<String> habilitiesAkaza = new ArrayList<String>();
        habilitiesAkaza.add("ShockWave");
        akaza.setHabilities(habilitiesAkaza);
        akaza.getRank().setPosition(3);
        akaza.setType(new Bad());
        akaza.setLoyalToMuzan(true);
        akaza.setHType(new Normal());

        Demon<NormalDemon> tamayo = muzan.createDemon(NormalDemon.class);
        tamayo.setName("Tamayo");
        tamayo.setType(new Good());
        List<String> habilitiesTamayo = new ArrayList<String>();
        habilitiesTamayo.add("Healing");
        tamayo.setHabilities(habilitiesTamayo);
        tamayo.setLoyalToMuzan(false);
        tamayo.setHType(new Normal());

        Demon<SuperiorMoon> kokushibo = muzan.createDemon(SuperiorMoon.class);
        kokushibo.setName("Kokushibo");
        List<String> habilitiesKokushibo = new ArrayList<String>();
        habilitiesKokushibo.add("Barrages of erratic crescent moon-shaped blades");
        kokushibo.setHabilities(habilitiesKokushibo);
        kokushibo.getRank().setPosition(1);
        kokushibo.setType(new Bad());
        kokushibo.setLoyalToMuzan(true);
        FinalSelection kokushiboSelecao = new FinalSelection();
        kokushiboSelecao.getApproved().add("Kokushibo");
        DemonHunter kokushiboDemonHunter = new DemonHunter(kokushiboSelecao);

        Breathing kokushiboBreathing = new Breathing();
        NichirinBlade kokushiboBlade = new NichirinBlade();
        kokushiboBlade.setBladeColor("Purple");
        kokushiboBlade.setAttribute("Supernatural");
        kokushiboBlade.setOre("Nichirin Metal");
        kokushiboBreathing.setForm(16);
        kokushiboBreathing.setType("Moon");
        kokushiboDemonHunter.setBlade(kokushiboBlade);
        kokushiboDemonHunter.setBreathingStyle(kokushiboBreathing);
        kokushibo.setHType(kokushiboDemonHunter);

        DemonHunterSquad squad = new DemonHunterSquad();
        squad.setLocal("Ubuyashiki Property");

        Human tanjiro = new Human();
        squad.setHunters(tanjiro);
        tanjiro.setName("Tanjiro");
        tanjiro.setAge(13);
        FinalSelection finalSelectionTanjiro = new FinalSelection();
        finalSelectionTanjiro.getApproved().add("Tanjiro");
        DemonHunter tanjiroDemonHunter = new DemonHunter(finalSelectionTanjiro);
        finalSelectionTanjiro.setLocal("Mount Fujikasane");
        finalSelectionTanjiro.addSteps(
            new Attack("Tanjiro", "Enters the Final Selection and faces the demons."),
            new Attack("Tanjiro", "Uses Water Breathing to defeat the first demon."),
            new Attack("Tanjiro", "Faces another demon and defeats it with a powerful slash."),
            new Attack("Tanjiro", "Survives the final test and becomes a Demon Slayer.")
        );

        Breathing tanjiroBreathing = new Breathing();
        tanjiroBreathing.setForm(10);
        tanjiroBreathing.setType("Water");
        tanjiroDemonHunter.setBreathingStyle(tanjiroBreathing);
        NichirinBlade tanjiroBlade = new NichirinBlade();
        HuntersMark tanjiroMark = new HuntersMark();
        Uniform tanjiroUniform = new Uniform();
        tanjiroUniform.setColor("Green and Black");
        tanjiroDemonHunter.setUniform(tanjiroUniform);
        tanjiroMark.setAwakened(true);
        tanjiroDemonHunter.setHuntersMark(tanjiroMark);
        tanjiroBlade.setBladeColor("Black");
        tanjiroBlade.setAttribute("Unknown");
        tanjiroBlade.setOre("Nichirin Metal");
        tanjiro.setHType(tanjiroDemonHunter);
        // Execute the final selection
        finalSelectionTanjiro.execute();
        tanjiro.setKills(2);
        System.out.println("");
        Fight tanjiroVSKyogai = new Fight();
        tanjiroVSKyogai.setHumans(tanjiro);
        tanjiroVSKyogai.setDemons(kyogai);
        tanjiroVSKyogai.setLocal("Tsuzumi Mansion");
        List<Object> winners = new ArrayList<Object>();
        List<Object> losers = new ArrayList<Object>();
        winners.add(tanjiro);
        losers.add(kyogai);
        tanjiroVSKyogai.setWinners(winners);
        tanjiroVSKyogai.setLosers(losers);
        tanjiroVSKyogai.addSteps(
            new Attack("Kyogai", "Flips the room upside down with his tsuzumi."),
            new Attack("Tanjiro", "Adapts to the shifting room and approaches."),
            new Attack("Kyogai", "Unleashes Rapid Drumming with deadly slashes."),
            new Attack("Tanjiro", "Uses Ninth Form: Splashing Water Flow, Turbulent, to behead Kyogai.")
        );

        // Execute the fight
        tanjiroVSKyogai.execute();

        // Display consequences
        System.out.println("Tanjiro's kills: " + tanjiro.getKills()); // Output: 1
        System.out.println("Kyogai's status: " + (kyogai.isDied() ? "Dead" : "Alive"));
    }
}