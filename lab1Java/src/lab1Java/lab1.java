package lab1Java;


import  java.util.*;
public class lab1 {
	 public static void main(String[] args) {
	        Scanner inp = new Scanner(System.in);
	        int n, divisor = 2;
	        System.out.println("������� �����");
	        
	        n = inp.nextInt();
	        
	        if(n != 0 && n != 1) {
	        	while(n > 1){
	        		if(n % divisor == 0){
	        			n = n / divisor;
	                	System.out.println("��������:" + divisor);
	        		} else {
	        			divisor++;
	        		} 
	            
	            // System.out.println(n);
	        	}
	        
	        } else {
	        	System.out.println("��������:" + n);
	        }
	        
	        
	        //System.out.println(n);
	    }
}
