import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connecter {

    Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
//pour afficher l erreur
    }
    try{
    		con = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/notes","root", "");
                
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}
    
}
