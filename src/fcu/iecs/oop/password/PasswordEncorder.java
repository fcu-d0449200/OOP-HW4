package fcu.iecs.oop.password;

public class PasswordEncorder {
  public String encode(String password){
	String change=password.replace("A","4");  
	String change1=change.replace("a","4");
	String change2=change1.replace("E","3");
	String change3=change2.replace("e","3");
	String change4=change3.replace("I","1");
	String change5=change4.replace("i","1");
	String change6=change5.replace("O","0");
	String change7=change6.replace("o","0");
	String change8=change7.replace("T","7");
	String change9=change8.replace("t","7");
	System.out.println("Âà´««á: "+change9);
	return password;
  }
}