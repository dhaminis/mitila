import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
class Retrieve
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","hr");
Statement stmt=conn.createStatement();
//*******RETRIEVEING THE DATA FROM EMPLOYEE******
/*String sql1="SELECT *FROM EMPLOYEE";
ResultSet rs=stmt.executeQuery(sql1);
while(rs.next())
{
System.out.print(rs.getString(1)+"\t");
System.out.print(rs.getString(2)+"\t");
System.out.print(rs.getString(3)+"\t");
System.out.print(rs.getString(4)+"\t");
System.out.print(rs.getString(5)+"\t");
System.out.print(rs.getString(6)+"\t");
System.out.print(rs.getString(7)+"\t");
System.out.print(rs.getString(8)+"\t");
System.out.print(rs.getString(9)+"\t");
System.out.print(rs.getString(10)+"\t");
System.out.println(rs.getString(11)+"\t");
System.out.print(rs.getString(12)+"\t");
System.out.print(rs.getString(13)+"\t");
System.out.print(rs.getString(14)+"\t");
System.out.println();
}
********RETRIEVING DATA FROM THE DEPENDANTS*******
String sql2="SELECT *FROM DEPENDANTS";
ResultSet rs=stmt.executeQuery(sql2);
while(rs.next())
{
System.out.print(rs.getString(1)+"\t");
System.out.print(rs.getString(2)+"\t");
System.out.print(rs.getString(3)+"\t");
System.out.print(rs.getString(4)+"\t");
System.out.print(rs.getString(5)+"\t");
System.out.println();
}*/
//******RETRIEVING DATA FROM THE EDUCATIONAL_QUALIFICATION******
String sql3="SELECT *FROM EDUCATIONAL_QUALIFICATION";
ResultSet rs=stmt.executeQuery(sql3);
while(rs.next())
{
System.out.print(rs.getString(1)+"\t");
System.out.print(rs.getString(2)+"\t");
System.out.print(rs.getString(3)+"\t");
System.out.print(rs.getString(4)+"\t");
System.out.print(rs.getString(5)+"\t");
System.out.print(rs.getString(6)+"\t");
System.out.print(rs.getString(7)+"\t");
System.out.println();
}

System.out.println("done");
}
}
