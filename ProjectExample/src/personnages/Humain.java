package personnages;

public class Humain {
	String nom;
	String bf;
	float qa;
	
	public Humain(String nom, String bf, float qa) {
        this.nom = nom;
        this.bf = bf;
        this.qa = qa;
    }
	
	public String getNom() {
		return this.nom;
	}
	
	public String getBf() {
		return this.bf;
	}
	
	public float getQa() {
		return this.qa;
	}
	
	public void gagnerArgent(float montant) {
        if (montant > 0) {
            qa += montant;
            parler("J'ai gagné " + montant + " ! Il me reste " + qa + ".");
        }
    }
	
	public void perdreArgent(float montant) {
        if (montant > 0 && montant <= qa) {
            qa -= montant;
            parler("J'ai perdu " + montant + " ! Il me reste " + qa + ".");
        } else {
            parler("Je n'ai pas assez d'argent pour perdre " + montant + " !");
        }
    }
	
	public void parler(String texte) {
		System.out.println("(<" + this.nom + ")>" + texte);
	}
	
	public void direBonjour() {
		String texte = "Bonjour ! Je m’appelle " + this.nom + "et j’aime boire du " + this.bf;
		parler(texte);
	}
	
	public void boire() {
		String texte = "Mmmm, un bon verre de " + this.bf + " ! GLOUPS !";
		parler(texte);
	}
	
}
