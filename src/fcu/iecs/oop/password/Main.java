package fcu.iecs.oop.password;
import java.beans.Encoder;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String a;
        String b="exit";
		PasswordEncorder console=new PasswordEncorder();
     do{
    	 System.out.println("Please enter a passwoorf : ");
    	 a=scanner.next();
    	 if(a.equals(b))break;
    	 console.encode(a);
         //String b=a.replace("A","4"); 
    	 //System.out.println("Âà´««á: "+a);
     }while(true);
	}

}