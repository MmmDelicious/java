
/*Перестроить заданную вещественную матрицу так, чтобы характеристики её столбцов
убывали. Характеристикой столбца называется сумма модулей его элементов.
Дектерёв ПИ-21(э)
*/



package lab4java;
import java.util.*;







// i = СТРОКИ j = СТОЛБЦЫ




public class lab4 {
	public static int[][] randomMatrix(int a , int b) {
		int[][] matrix = new int[a][b];
		for(int i = 0; i < a; i++)
			for(int j = 0; j < b; j++) {
				matrix[i][j] = (int) ((Math.random() * 11) - 10);
			}
		
		
		return matrix;
	}
	
	public static void showMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	
	
	public static int[][] moveMatrix(int[][] matrix, int a, int b) {
		int tempMatrix;
		int tempArray;
		
		
		// Массив для сумм столбцов
		int[] columnSums = new int[b];
		
		for(int i = 0; i < b; i++) {
			columnSums[i] = 0;
		}
		
		for(int i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) {
				
				columnSums[j] += Math.abs(matrix[i][j] );
			}
			
		}
		
		//Если меняются местами элементы массива, то меняем столбцы местами
		for(int j = 0; j < b; j++)
			for(int k = 0; k < b - 1; k++) {
				
				if(columnSums[k] > columnSums[k + 1])
				{
					
				tempArray = columnSums[k];
				columnSums[k] = columnSums[k + 1];
				columnSums[k + 1] = tempArray;	
					
					
				for(int i = 0; i < matrix.length; i++) 
					
					 {
						
				tempMatrix = matrix[i][k];
				matrix[i][k] = matrix[i][k+1];
				matrix[i][k+1] = tempMatrix;
					}
				}
			}
		//for(int i = 0; i < b; i++) {
			//System.out.println(columnSums[i]);
		//}
		return matrix;
		
	}
	
	
	public static void main(String[] args) {
	System.out.println("Введите размеры матрицы");
	Scanner inp = new Scanner(System.in);
	int a,b;
	a = inp.nextInt();
	b = inp.nextInt();
	int[][] matrix = randomMatrix(a,b);
	System.out.println("Матрица");
	showMatrix(matrix);
	moveMatrix(matrix,a,b);
	System.out.println("Матрица после изменений");
	showMatrix(matrix);
	

	}
}
