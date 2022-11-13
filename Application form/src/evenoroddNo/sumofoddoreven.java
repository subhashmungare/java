package evenoroddNo;

import java.util.Iterator;

public class sumofoddoreven {

	public static void main(String[] args) {
		       int n=21;
		       int count=0;
		       for (int i = 1; i <=n; i++) {
		    	   if (n%i==0) {
		    		   count++;
					
				}
		    	   if (count==2) {
		    		   System.out.println(n);
					
				}else {
					System.out.println(n+"not a prime");
				}
		    	
			}
	
	
	
	
	
	
	
	
	}}