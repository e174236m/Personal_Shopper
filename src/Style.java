import java.util.ArrayList;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Style {

	private String nom;
	private JSONObject RQ; //Reponses aux questions
	private JSONObject VT; //Correspondance aux vettements
	
	public Style(String nom, JSONObject RQ, JSONObject VT) {
		this.nom = nom;
		this.RQ = RQ;
		this.VT = VT;
	}

	@Override
	public String toString() {
		return "Style [nom=" + nom + ", RQ=" + RQ + ", VT=" + VT + "]";
	}
		
}
