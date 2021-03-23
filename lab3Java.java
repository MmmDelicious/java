/*Дан линейный целочисленный массив, заполненный случайными числами из диапазона *-1000; +1000+. 
 * Найти элемент с минимальным значением и элемент с максимальным значением,
 * зеркально перевернуть часть массива между этими элементами*/



package lab3Java;


import java.util.*;



public class lab3Java {
	//функция возвращает индекс минимального числа в массиве
	public static int imin(int[] a){
		int min = a[0];
		int imin = 0;
       for(int i = 0; i < a.length; i++) {
    	   if(a[i]<min) {
    		  imin = i;
    		  min = a[i];
    	   }
       }
       return imin;
    }
	//функция возвращает индекс максимального числа в массиве
	public static int imax(int[] a){
		int max = a[0];
		int imax = 0;
       for(int i = 0; i < a.length; i++) {
    	   if(a[i]>max) {
    		   imax = i;
    		   max = a[i];
    	   }
       }
       return imax;
    }	
	//функция отзеркаливает числа между минимальным и максимальным числом
	public static void moveArray(int a[]) {
		int imin = imin(a);
		int imax = imax(a);
		
		int temp;
		int it = 0;
		
		
		if(imin < imax) {
			while(it < (imax - imin) / 2) {
				temp = a[imin + 1 + it];
				a[imin + 1 + it] = a[imax - 1 - it];
				a[imax - 1 - it] = temp;
				it++;
			}
		} else {
			while(it < (imin - imax) / 2) {
				temp = a[imax + 1 + it];
				a[imax + 1 + it] = a[imin - 1 - it];
				a[imin - 1 - it] = temp;
				it++;
		}

			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int arrSize = inp.nextInt();
		int[] array = new int[arrSize];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) ((Math.random() * 2001) - 1000);
		}
		System.out.println("Минимальное число" + imin( array));
		System.out.println("Максимальное число" + imax(array));
		//System.out.println("Старый массив");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	

		moveArray(array);
		System.out.println("Новый массив");
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
