package personnages.principaux;
import personnages.Humain;

public class Commercant extends Humain{
	
	public Commercant(String nom, float qa) {
        super(nom, "thé", qa);
    }
	
	public void seFaireExtorquer() {
		float qa = getQa();
		perdreArgent(qa);
		parler("le monde est vraiment injuste");
	}
	
	public void recevoir(float qa) {
		gagnerArgent(qa);
		parler("Je vous remercie infiniment, noble Ronin !");
	}

}
