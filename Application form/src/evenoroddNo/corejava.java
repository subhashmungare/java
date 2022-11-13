package evenoroddNo;

import java.util.Iterator;

public class corejava {
    //check the no is prime or not

	public static void main(String[] args) {
	int n=10;
		int count=1;
		for (int i = 1; i <=n; i++) {
			if (n%i== 0) {count++;
			}
			if (count==2) {
				System.out.println(n+"  prime   no");
			
			}
			else {
				System.out.println(n+"   not prime");
			}
			
		}
		 
		
		}}