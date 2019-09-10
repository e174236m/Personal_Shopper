import java.util.Date;


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
	
}
