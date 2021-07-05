import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
class InsertUpdate
{
public static void main(String args[])
{
String sql1="INSERT INTO EMPLOYEE VALUES(101,'ANJALI','H',121,12-11-2009,'MTECH','DEVELOPER',14-12-2019,'ON',15-01-1997,'ABC','FEMALE','O','BANGALORE')";
String sql2="INSERT INTO DEPENDANTS VALUES('ANJALI','H','FEMALE',15-12-1997,'ABC')";
String sql3="INSERT INTO EDUCATIONAL_QUALIFICATION VALUES('MTECH',15-06-2006,30-04-2008,'CSE','KSIT','BANGALORE',88)";
String sql4="UPDATE EMPLOYEE SET FIRSTNAME='KEERTHI' WHERE ID=101";
try(Connection conn=Util.getConnection();
    Statement stmt=conn.createStatement();)
{
stmt.executeUpdate(sql1);
System.out.println("sql1 trigged successfully");
stmt.executeUpdate(sql2);
System.out.println("sql2 trigged successfully");
stmt.executeUpdate(sql3);
System.out.println("sql3 trigged successfully");
stmt.executeUpdate(sql4);
System.out.println("sql4 trigged successfully");

}
catch(SQLException ex)
{
ex.printStackTrace();
}
System.out.println("done");
}
}
