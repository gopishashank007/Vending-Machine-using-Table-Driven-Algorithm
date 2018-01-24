package simulatingVendingMachine;

import java.util.Scanner;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int item = 0;
		System.out.println("**************************************************************");
		System.out.println("Welcome to the Simulation of Vending Machine");
		System.out.println("**************************************************************");
		System.out.println("Below Mentioned are the items present in our Vending Machine");
		System.out.println("______________________________________________________________");
		System.out.printf("%1s  %-7s   %-7s%n", "Item Number", "Item Name", "Price(cents)");
		System.out.println("______________________________________________________________");
		System.out.printf("%1d  %19s   %7d%n", 1, "Chocolate", 50);
		System.out.printf("%1d  %19s   %7d%n", 2, "Chips", 200);
		System.out.printf("%1d  %19s   %7d%n", 3, "Water", 80);
		System.out.printf("%1d  %19s   %7d%n", 4, "Coke", 180);
		// System.out.printf("%1d %19s %7d%n", 5, "Dew", 120);

		System.out.println("**************************************************************");

	}

}
