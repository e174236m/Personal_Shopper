
public class Vetement {
	
	private String type;
	private String couleur;
	private int prix;
	private String matiere;
	private String motif;
	private String saison;
	private String temps;

	public Vetement(String type, String couleur, int prix, String matiere, String motif, String saison, String temps){
		this.type = type;
		this.couleur = couleur;
		this.prix = prix;
		this.matiere = matiere;
		this.motif = motif;
		this.saison = saison;
		this.temps = temps;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	public String getTemps() {
		return temps;
	}

	public void setTemps(String temps) {
		this.temps = temps;
	}
	
	
}
