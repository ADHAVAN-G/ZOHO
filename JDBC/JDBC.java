import java.sql.*;
import java.util.*;
public class JDBC {

	public static void main(String[] args) throws Exception {
		String query1="show tables";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","adhav1405");
		Statement statement=con.createStatement();
		ResultSet rs1=statement.executeQuery(query1);
		
		TreeSet<String>tables=new TreeSet();
		while(rs1.next()) {
			tables.add(rs1.getString(1));
		}
		System.out.println("Tables present in the database-->"+tables.toString());
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the table from the above list");
		String table=scanner.next();
		String query2="describe "+table;
		ResultSet rs2=statement.executeQuery(query2);
	
		while(rs2.next()) {
			System.out.println(rs2.getString(1)+" "+rs2.getString(2));
		}
		System.out.println("1--->select specific column");
		System.out.println("2--->select all the rows and columns");
		System.out.println("Enter the operation to be performed");
		int operation=scanner.nextInt();
		if(operation==1) {
			System.out.println("Enter a col name==");
			String col=scanner.next();
			String query="select "+col+" from "+table;
			ResultSet rs3=statement.executeQuery(query);
			while(rs3.next()) {
				System.out.println(rs3.getString(1));
			}
		}
		else if(operation==2) {
			String query="select * from "+table;
			ResultSet rs3=statement.executeQuery(query);
			ResultSetMetaData rsmd=rs3.getMetaData();
			int col_count=rsmd.getColumnCount();
			while(rs3.next()) {
				int i=1;
				while(i<=col_count) {
					System.out.print(rs3.getString(i)+" ");
					i++;
				}
				System.out.println();
			}
		}
		statement.close();
		con.close();
	}

}
