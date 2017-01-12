package warehouseorderingtrackingsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class NBGardensDB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/nbgardensdb";
	static final String USER = "root";
	static final String PASS = "password";
	static Connection conn = null;
	static Statement stmt = null;
	
	public void accessDB(){
		
		try{
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void getAllInventoryItems() throws SQLException {
		String query = "SELECT *, COUNT(itemNo) AS qty FROM items GROUP BY itemNo";
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()){
			String itemNo = rs.getString("itemNo");
			String itemName = rs.getString("itemName");
			String itemDescription = rs.getString("itemDescription");
			String location = rs.getString("location");
			int qty = rs.getInt("qty");
			System.out.println("Item Number: " + itemNo + ", Item: " + itemName + ", Description: " + itemDescription + ", Location: " + location + ", Stock Quantity: " + qty);
		}
		rs.close();
	}
	
	public void insertItemsToInventory(int itemNo, String itemName, String itemDescription, String location) throws SQLException{
		System.out.println("Inserting records into the table...");
		stmt = conn.createStatement();
		String sql = "INSERT INTO items(itemNo, itemName, itemDescription, location) VALUES ";
		sql += "(" + itemNo + ",'" + itemName + "','" + itemDescription + "','" + location + "')";
		stmt.executeUpdate(sql);
		System.out.println(itemName + " added to " + location);
	}
	
	
	
}
