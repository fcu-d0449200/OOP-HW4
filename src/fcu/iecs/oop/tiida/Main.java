package fcu.iecs.oop.tiida;
import java.util.Scanner;

import fcu.iecs.oop.password.PasswordEncorder;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NissanTiida console=new NissanTiida();
		int x,y;
		System.out.println("Please enter a number:");
		x=scanner.nextInt();
		for(y=1;y<=x;y++){
			console.tiida();
		}
		
	}

}