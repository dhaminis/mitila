import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
class CreateDemo
{
public static void main(String args[])
{
//String sql1="CREATE TABLE EMPLOYEE(ID NUMBER,FIRSTNAME VARCHAR2(10),LASTNAME VARCHAR2(10),EMPLOYMENTID NUMBER,STARTDATE NUMBER,DESIGNATION VARCHAR2(10),DEPARTMENT VARCHAR2(10),ENDDATE NUMBER,STATUS VARCHAR2(10),DATEOFBIRTH NUMBER,REPORTINGMANAGER VARCHAR2(10),GENDER VARCHAR2(10),BLOODGROUP VARCHAR2(10),ADDRESS VARCHAR2(10))";
//String sql2="CREATE TABLE DEPENDANTS(FIRSTNAME VARCHAR2(10),LASTNAME VARCHAR2(10),GENDER VARCHAR2(10),DATEOFBIRTH NUMBER,RELATIONSHIP VARCHAR2(10))";
String sql3="CREATE TABLE EDUCATIONAL_QUALIFICATION(TYPE VARCHAR2(10),STARTDATE NUMBER,ENDDATE NUMBER,TYPE1 VARCHAR2(10),INSTITUTION VARCHAR2(10),ADDRESS VARCHAR2(10),PECENTAGE NUMBER)";
try(Connection conn=Util.getConnection();
    Statement stmt=conn.createStatement();)
{
//stmt.execute(sql1);
//System.out.println("done");
//stmt.execute(sql2);
//System.out.println("done");
stmt.execute(sql3);
System.out.println("done");
}
catch(SQLException ex)
{
ex.printStackTrace();
}
System.out.println("done");
}
}
