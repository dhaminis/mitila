import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
class Delete
{
public static void main(String args[])
{
String sql1="DELETE FROM EMPLOYEE WHERE ID=101";
/*String sql2="DELETE FROM DEPENDANTS WHERE FIRSTNAME='ANJALI'";
String sql3="DELETE FROM EDUCATIONAL_QUALIFICATION WHERE TYPE='MTECH'";*/
try(Connection conn=Util.getConnection();
    Statement stmt=conn.createStatement();)
{
stmt.execute(sql1);
System.out.println("done");
/*stmt.execute(sql2);
System.out.println("done");
stmt.execute(sql3);
System.out.println("done");*/
}
catch(SQLException ex)
{
ex.printStackTrace();
}
System.out.println("done");
}
}
