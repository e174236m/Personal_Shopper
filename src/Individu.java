import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Individu {

	private int id;
	private String style;
	private int budget;
	private Date date;
	private String Lieu;
	
	public Individu(int id, String style, int budget, Date date, String lieu) {
		this.id = id;
		this.style = style;
		this.budget = budget;
		this.date = date;
		this.Lieu = lieu;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLieu() {
		return Lieu;
	}

	public void setLieu(String lieu) {
		Lieu = lieu;
	}
	
	public String question() {
		
		ArrayList listeReponses = new ArrayList();
		
		// create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);	    
	    
	    System.out.println("Quelle est la date de l'occasion ? (jj/mm/aaaa) ");	    
	    DateFormat q1 = new SimpleDateFormat(scanner.next());

	    System.out.println("Pour quelle occasion souhaitez vous cette Box ? (tenue quotidienne / travail / soiree)");
	    String q2 = scanner.next();
	    
	    System.out.println("Quel est le lieu de l'occasion : ");
	    String q3 = scanner.next();
	    
	    System.out.println("Quelles sont vos couleurs favorites parmis les suivantes : bleu, blanc, gris, jaune, marron, noir, orange, rose, rouge, vert, violet ? (Veuillez séparer vos réponses par des virgules) ");
	    String q4 = scanner.next();
	    
	    System.out.println("Quel est votre Genre prefere : decontracte, business, classique, tendance ? ");
	    String q5 = scanner.next();
	    
	    System.out.println("Quel genre de chemise preferez vous porter : decontracte, buisness ? ");
	    String q6 = scanner.next();
	    
	    System.out.println("Quel coupe de chemise preferez vous : slim, classique ? ");
	    String q7 = scanner.next();
	    
	    System.out.println("Quel genre de veste preferez vous : trench, veste en cuire, parka, doudoune, manteau, gilet, veste matelassee, blouson ? ");
	    String q8 = scanner.next();
	    
	    System.out.println("Quel genre de pantalon portez vous : jeans, chinos, pantalon business ? ");
	    String q9 = scanner.next();
	    
	    System.out.println("Quel genre de coupe de pantalon preferez-vous : skinny, slim, classique, fuselee ? ");
	    String q10 = scanner.next();

	    System.out.println("Quel est votre genre de chaussure : tongs, boots chevilles, boots, business, baskets ? ");
	    String q11 = scanner.next();
	    
	    System.out.println("Quel est votre fourchette de prix pour l'ensemble :");
	    System.out.print("Minimum : ");
	    String q121 = scanner.next();
	    System.out.print("Maximum : ");
	    String q122 = scanner.next();
	    
	    listeReponses.add(q1);
		return q122;
	}
	
}
