package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public abstract class TypeHuman {

    public abstract NichirinBlade getBlade();

    public abstract void setBlade(NichirinBlade blade);

    public abstract Breathing getBreathingStyle();

    public abstract void setBreathingStyle(Breathing breathingStyle);

    public abstract String getExpertise() ;

    public abstract TypeHunter getTypeHunter();

    public abstract void setTypeHunter(TypeHunter typeHunter);

    public abstract void setExpertise(String expertise);
}
