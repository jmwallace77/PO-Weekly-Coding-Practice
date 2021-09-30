package main.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1 = -400;
		int num2 = 200;
		System.out.println("Numbers before Swap. Num1: " + num1 + " Num2: " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after Swap. Num1: " + num1 + " Num2: " + num2);
	}

}
