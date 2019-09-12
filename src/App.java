import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, JSONException, org.json.simple.parser.ParseException{
		
		String url = "jdbc:mysql://infoweb/E174924K?useTimezone=true&serverTimezone=UTC"; 
		String user = "E174924K";
		String pwd = "E174924K";
		
		Connexion conn = new Connexion(url, user, pwd);
		conn.connexionBD();
		

        JSONParser parser = new JSONParser();
        
        try {     
        	Object file = parser.parse(new FileReader("./json/regles.json"));
        	    		
        	JSONArray obj =  (JSONArray) file;
            
            //JSONObject jsonObj = (JSONObject) obj.get(0);
            
            //JSONObject id = (JSONObject) ((JSONObject) jsonObj.get("questions")).get("chemise");
            //System.out.println(id);      
            
            obj.forEach(item -> {
            	JSONObject itemObj = (JSONObject) item;
            	String idItem = itemObj.get("id").toString();
            	JSONObject questions = (JSONObject) itemObj.get("questions");
            	JSONObject bdd = (JSONObject) itemObj.get("BDD");
            	Style s = new Style(idItem, questions, bdd);
            	System.out.println(s);
            });
             
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

        /*JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);
        }*/
		
		
		
	} 
	
	
}
