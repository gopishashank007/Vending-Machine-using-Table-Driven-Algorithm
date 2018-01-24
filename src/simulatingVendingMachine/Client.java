package simulatingVendingMachine;

import java.util.Scanner;

public class Client
{

  public static void main( String[] args )
  {

    /*
     * Initially Vending Machine will be 'noMoneyState'
     */
	while(true){
		VendingMachine vendingMachine = new VendingMachine();

	    System.out.println("Current VendingMachine State : "
	                    + vendingMachine.getVendingMachineState().getClass().getName()+"\n");
	    
	    Scanner keyboard = new Scanner(System.in);
		int item = 0;
		System.out.println("**************************************************************");
		System.out.println("Welcome to the Simulation of Vending Machine");
		System.out.println("**************************************************************");
		System.out.println("Below Mentioned are the items present in our Vending Machine");
		System.out.println("______________________________________________________________");
		System.out.printf("%1s  %-7s   %-7s%n", "Item Number", "Item Name", "Price(cents)");
		System.out.println("______________________________________________________________");
		System.out.printf("%1d  %19s   %7d%n", 1, "Chocolate", 130);
		System.out.printf("%1d  %19s   %7d%n", 2, "Chips", 25);
		System.out.printf("%1d  %19s   %7d%n", 3, "Water", 50);
		System.out.printf("%1d  %19s   %7d%n", 4, "Coke", 125);
		System.out.println("Type exit to exit the application");
		// System.out.printf("%1d %19s %7d%n", 5, "Dew", 120);

		System.out.println("**************************************************************");

		System.out.println("Please enter the item to dispense");
		try {
			item = Integer.parseInt(keyboard.nextLine());
			
			if(item<1 || item>4){
				System.out.println("Item not available");
			}
			else{
				System.out.println("Enter the amount ");
				int amount = Integer.parseInt(keyboard.nextLine());
				String itemToPass = "";
				switch(item){
				case 1: itemToPass = "Chocolate";break;
				case 2: itemToPass = "Chips";break;
				case 3: itemToPass = "Water";break;
				case 4: itemToPass = "Coke";break;
				}
				vendingMachine.selectProductAndInsertMoney(amount, itemToPass);
			}
		} catch (NumberFormatException name) {
			System.exit(0);
		}
			
	}
    
//    vendingMachine.dispenseProduct();
    
//    vendingMachine.dispenseProduct();

    /*
     * Money has been inserted so vending Machine changed the
     * internal state to 'hasMoneyState'
     */

    /*System.out.println("\nCurrent VendingMachine State : "
                    + vendingMachine.getVendingMachineState().getClass().getName()+"\n");

    vendingMachine.selectProductAndInsertMoney(100, "Water");
//    vendingMachine.dispenseProduct();

    
     * Product has been dispensed so vending Machine changed the
     * internal state to 'NoMoneyState'
     
    
    System.out.println("\nCurrent VendingMachine State : "
                    + vendingMachine.getVendingMachineState().getClass().getName());*/

  }

}
