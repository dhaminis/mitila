import java .net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;
public class Ipaddress
{
public static void main(String args[])throws Exception
{
InetAddress localhost=InetAddress.getLocalHost();
System.out.println("IP Address:"+(localhost.getHostAddress()));
//***DISPLAYING TIME***
Calendar c=Calendar.getInstance();
System.out.println("Current Date and time:");
System.out.format("%B %te, %tY%n", c,c,c);
System.out.format("%tl %tM, %tp%n", c,c,c);


}
}

