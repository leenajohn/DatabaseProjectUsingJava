package test;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DeleteExample {

		public static void main(String[] args)  throws SQLException, ClassNotFoundException{
			// TODO Auto-generated method stub
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root","root");
			
			Statement stmt = con.createStatement();
						
			
			stmt.executeUpdate("delete from eproduct where name ='Mobile'");
			
		ResultSet rs=	stmt.executeQuery("Select * from eproduct");
		
			while(rs.next()) {
				
				System.out.println(rs.getString("name"));
				
				System.out.println(rs.getString("price"));
			}
			con.close();

		}

		}





