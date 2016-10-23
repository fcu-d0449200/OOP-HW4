package fcu.iecs.oop.tiida;

public class NissanTiida {
	int i,j,n=1;
	public void tiida(){
	    for(i=1;i<=n;i++){
	    	for(j=1;j<=n;j++){
	    		System.out.printf("*");
	    		if(j==n)System.out.printf("\n");
	    		if(i==n&&j==n)System.out.printf("\n");
	    }
	  }	n++;
	}
}