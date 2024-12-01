package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;


public class DemonHunter extends TypeHuman {
    private String expertise;
    private TypeHunter typeHunter;
    private NichirinBlade blade;
    private Breathing breathingStyle;
    private FinalSelection selecaoFinal;
    private HuntersMark huntersMark;
    private Uniform uniform;
    
    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
    }

    public HuntersMark getHuntersMark() {
        return huntersMark;
    }

    public void setHuntersMark(HuntersMark huntersMark) {
        this.huntersMark = huntersMark;
    }

    public NichirinBlade getBlade() {
        return blade;
    }

    public  DemonHunter(FinalSelection s) {
        this.selecaoFinal = s;
    }

    public void setBlade(NichirinBlade blade) {
        this.blade = blade;
    }

    public Breathing getBreathingStyle() {
        return breathingStyle;
    }

    public void setBreathingStyle(Breathing breathingStyle) {
        this.breathingStyle = breathingStyle;
    }

    public String getExpertise() {
        return expertise;
    }

    public TypeHunter getTypeHunter() {
        return typeHunter;
    }

    public void setTypeHunter(TypeHunter typeHunter) {
        this.typeHunter = typeHunter;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
    
}
