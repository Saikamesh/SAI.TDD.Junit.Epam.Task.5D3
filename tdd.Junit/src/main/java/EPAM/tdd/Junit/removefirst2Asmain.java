package EPAM.tdd.Junit;
import java.util.Scanner;
public class removefirst2Asmain 
{
public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any string");
	String string=s.nextLine();
	System.out.println("Input String is: "+string);
	removefirst2As rf=new removefirst2As();
	string=string.toUpperCase();
	String result =rf.removeAs(string);
	System.out.println("After removing 'A' or 'a' from First two Positions of string.\nThe Result is: "+result);
	s.close();
	}
}
