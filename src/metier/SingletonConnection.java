package metier;

import java.sql.Connection;
import java.sql.DriverManager;

// declare un objet static d type static 
public class SingletonConnection {
private static Connection connection;
static { // s'exe au moment du cahrgement en memoire
	try {
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","59807123***Ss");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection getConnection() {
	return connection;
}

}
