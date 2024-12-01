package br.edu.unifei.ecot12a.trabalhofinal.demonslayer;

public abstract class Step {
    private Step next;
    public Step setNext(Step next) {
        this.next = next;
        return this.next; // Garante o encadeamento contínuo
    }
    
    public Step getNext() {
		return next;
	}
    
}
