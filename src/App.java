import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class App {

	public static void main(String[] args) throws ClassNotFoundException{
		
		Connection dbConnection = null;
		
		try{ 
			
			String URL = "jdbc:mysql://infoweb/E174924K?useTimezone=true&serverTimezone=UTC"; 
			Properties info = new Properties();
			info.put("user", "E174924K");
			info.put("password", "E174924K");
			
			// load and register JDBC driver for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			dbConnection = DriverManager.getConnection(URL, info);
			
			if (dbConnection != null) {
				//System.out.println("Successfully connected to MySQL database test");
				
				
				
				
			}
			
		} catch(SQLException sqle){
			
			System.out.println("Exception SQL : "); 
			
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
	
	
}
