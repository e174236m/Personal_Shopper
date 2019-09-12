import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class Connexion {
	
	private String url;
	private String user;
	private String pwd;
	
	
	public Connexion(String url, String user, String pwd) {
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}
	
	public void connexionBD() throws ClassNotFoundException {
		
		Connection dbConnection = null;
		
		try{ 
			
			// load and register JDBC driver for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			dbConnection = DriverManager.getConnection(this.url, this.user, this.pwd);
			
			if (dbConnection != null) {
				
				System.out.println("Connexion à la BD réussie");
				
			}
			
		} catch(SQLException sqle){
			
			System.out.println("Erreur lors de la Connexion à la BD : "); 
			
			while (sqle != null) { 
			  String message = sqle.getMessage(); 
			  String sqlState = sqle.getSQLState(); 
			  int errorCode = sqle.getErrorCode(); 
			  System.out.println("Message = "+message); 
			  System.out.println("SQLState = "+sqlState); 
			  System.out.println("ErrorCode = "+errorCode); 
			  sqle.printStackTrace(); 
			  sqle = sqle.getNextException(); 
			}
		}
		
	}
	
	/*public String select() {
		"Successfully connected to MySQL database"
		
		Statement stmt = dbConnection.createStatement();

		ResultSet rs;
		 
        rs = stmt.executeQuery("SELECT * FROM vestes WHERE motifs = 'carreaux' and temps = 'clear-day'");
        int i = 0;
        while ( rs.next() ) {
        	i++;
            String motifs = rs.getString("id");
            System.out.println(motifs);
        }
        System.out.println(i);
        dbConnection.close();
	}*/

}

