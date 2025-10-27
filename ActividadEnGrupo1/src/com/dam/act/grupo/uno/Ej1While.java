package com.dam.act.grupo.uno;

import java.util.Scanner;

public class Ej1While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero 1");
		int n1=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce numero 2");
		int n2=Integer.parseInt(sc.nextLine());
		sc.close();
		
		int nMayor;
		int nMenor;
		
		nMayor=(n1>n2)?n1:n2;
		nMenor=(n2>n1)?n1:n2;
		
		int i=nMenor;
		
		while (i<nMayor) {
			
			i++;
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
