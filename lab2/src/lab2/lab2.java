package lab2;


import java.util.*;

public class lab2 {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	
	
	int min = 999999, number,counter = 0;
    do {
    	System.out.println("¬ведите число");
    	number = inp.nextInt();
    	if(number != 0) {
    		if(min > number) {
    			min = number;
    			counter = 1;
    		} else if(number == min){
    			counter++;
    		} else if(min < number) {
    			continue;
    		}
    		}
       } while(number != 0);
	System.out.println(counter);
   }
}