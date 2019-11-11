package util;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.Statement;

public class Conexao {
	
	public static final String CREATE_TABLE = "CREATE TABLE VIAGEM"
			+"("
			+"CODIGO INT NOT NULL,"
			+"NOME VARCHAR(20) NOT NULL,"
			+"PRECO INT NOT NULL,"
			+"LUGAR VARCHAR(20) NOT NULL,"
			+"FOTOS BLOB,"
			+" PRIMARY KEY (CODIGO)"
			+")";
	
	
	public static Connection conexaoBD() {
		try {
			String sqlDriver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@oracle12c.cin.ufpe.br:1521:instance01";
			String user = "g192if685cc_eq08";
			String password = "tkwnxnjj";

			Class.forName(sqlDriver);
			Connection conn = DriverManager.getConnection(url, user, password);
			
			//Statement stmt = conn.createStatement();
			System.out.println("criando....");
			//stmt.execute(CREATE_TABLE);
			System.out.println("criada");
			//stmt.executeQuery("SELECT * FROM VIAGEM");
			return conn;
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	
	
	
}
