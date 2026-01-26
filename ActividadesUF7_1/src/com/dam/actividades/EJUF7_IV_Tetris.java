package com.dam.actividades;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class EJUF7_IV_Tetris {

	public static void main(String[] args) {
		HashMap<String,Integer> tetris = new HashMap<String,Integer>();
		
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			op = reqMenu(sc);
			
			switch(op) {
			case 1:
				addEntry(tetris,sc);
				break;
			case 2:
				viewScores(tetris);
				break;
			case 0:
				System.out.println("\nSaliendo del programa");
				break;
			default:
				System.out.println("\nOpción incorrecta");
			}
		}while(op != 0);
	}

	private static void viewScores(HashMap<String,Integer> tetris) {
		TreeMap<String,Integer> temp = new TreeMap<String,Integer>(tetris);
		
		for(Entry<String,Integer> entry : temp.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + "pts");
		}
	}

	private static void addEntry(HashMap<String,Integer> tetris,Scanner sc) {
		
		System.out.println("\nIngrese su nick");
		String nick = sc.nextLine();
		
		System.out.println("\nIngrese su puntuación");
		int score = Integer.parseInt(sc.nextLine());
		
		if(tetris.containsKey(nick)) {
			if(tetris.get(nick) > score) {
				System.out.println("\n¡Puntuación No Superada!");
			}else {
				tetris.put(nick, score);
				System.out.println("\n¡Nuevo Record!");
			}
		}else {
			tetris.put(nick, score);
			System.out.println("\n¡Puntuación Almacenada!");
		}
	}

	private static int reqMenu(Scanner sc) {
		System.out.println("1) Nuevo Registro");
		System.out.println("2) Mostrar Puntuaciones");
		System.out.println("0) Salir del programa");
		int op = Integer.parseInt(sc.nextLine());
		
		return op;
	}

}
