package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Podaj liczbę całkowitą: ");
	int a = in.nextInt();
	System.out.print("Dla liczby " + a + " dzielniki to: ");
	for(int i = 1; i < a; i++){
	    if(a%i == 0){
	        System.out.print(i +", ");
        }

    }
    System.out.print(a +".");
    }
}
