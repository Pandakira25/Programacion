package z.arraysBi;

import java.util.Random;

public class ArraysBi {
	
	//Default Constructor
	private ArraysBi() {}
	
	//Create ArrayBi
	public static Object [][] crateAB(int rows, int columns){
		return new Object [rows][columns];
	}
	
	//Fill ArrayBi Random
	public static void fillRdAB (Object[][] m, int min, int max) {
		Random rd = new Random();
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = rd.nextInt(min,max);
			}
		}
	}
	
	//Iterate ArrayBi left to right
	public static void ItABLR (Object [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length;j++) {
				//ToDo
			}
		}
	}
	
	//Iterate ArrayBi right to left
	public static void ItABRL(Object [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = m[i].length -1; j >= 0; j-- ) {
				//ToDo
			}
		}
	}
	
	//Iterate AB down-up left to right
	public static void ItABduL(Object [][] m) {
		for(int i = m.length - 1; i >= 0; i--) {
			for(int j = 0; j < m[i].length; j++) {
				//ToDo
			}
		}
	}
	
	//Iterate AB down-up right to left
	public static void ItABduR(Object [][] m) {
		for(int i = m.length - 1; i >= 0; i--) {
			for(int j = m[i].length - 1; j >= 0; j--) {
				//ToDo
			}
		}
	}
	
	//Iterate diagonal ArrayBi \
	public static void ItAbD(Object [][]m) {
		for(int i = 0; i < m.length; i++) {
			m[i][i]= null;
		}
	}
	
	//Iterate reverse diagonal ArrayBi /
	public static void ItAbRD(Object [][] m) {
		int j = m.length - 1;
		for(int i = 0; i < m.length; i++) {
			m[i][j] = null;
		}
	}
	
	//Iterate upper triangular ArrayBi
	public static void ItAbUT(Object [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(i < j) {
					//Upper Triangle
				}
			}
		}
	}
	
	//Iterate lower triangular ArrayBi
	public static void ItAbLT(Object [][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(i > j) {
					//Lower Triangle
				}
			}
		}
	}
	
	//Iterate upper triangular reverse diagonal ArrayBi
	public static void ItAbUTRD(Object [][] m) {
		int c = m[0].length - 1;//4
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < c - i; j++) { //mientras sea <= 2,1,0
				//00-01-02-x
				//10-11-x-x
				//20-x-x-x
				//x -x-x-x
			}
			
		}
	}
	
	//Iterate lower triangular reverse diagonal ArrayBi
	public static void ItAbLTRD(Object [][] m) {
		int c = m.length;
		for(int i = 0; i < c;i++) {
			for(int j = 0; j < c; j++) {
				//x-x-x
				//x-x-12
				//x-21-22
				if(i+j > c-1) {
					System.out.println(m[i][j] + "trángulo inferior de la diagonal inversa");
				}
			}
		}
	}
	
	
}
