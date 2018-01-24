package simulatingVendingMachine;

public class VendingMachine implements VendingMachineState {

	private VendingMachineState vendingMachineState;

	public VendingMachine() {
		vendingMachineState = new NoMoneyState();
	}

	public VendingMachineState getVendingMachineState() {
		return vendingMachineState;
	}

	public void setVendingMachineState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}

	@Override
	public void selectProductAndInsertMoney(int amount, String productName) {
		vendingMachineState.selectProductAndInsertMoney(amount, productName);
		VendingMachineState hasMoneyState = new HasMoneyState();
		switch (productName) {
		case "Chips":
			if (amount < 25) {
				System.out.println("Less amount for Chips,"+amount+" sent back");
			}
			else if (amount >= 25){
				changeFinalState(hasMoneyState);
				System.out.println("Dispensed "+productName);
				int change = amount -25;
				if(change>0){
					System.out.println("The change is "+change);	
				}
			}
			break;
		case "Water":
			if (amount < 50) {
				System.out.println("Less amount for water,"+amount+" sent back");
			}
			else if (amount >= 50){
				changeFinalState(hasMoneyState);
				System.out.println("Dispensed "+productName);
				int change = amount -50;
				if(change>0){
					System.out.println("The change is "+change);	
				}
			}
			break;
		case "Coke":
			if (amount < 125) {
				System.out.println("Less amount for Coke,"+amount+" sent back");
			}
			else if (amount >= 125){
				changeFinalState(hasMoneyState);
				System.out.println("Dispensed "+productName);
				int change = amount -125;
				if(change>0){
					System.out.println("The change is "+change);	
				}
			}
			break;
		case "Chocolate":
			if (amount < 130) {
				System.out.println("Less amount for Chocolate,"+amount+" sent back");
			}
			else if (amount >= 130){
				changeFinalState(hasMoneyState);
				System.out.println("Dispensed "+productName);
				int change = amount -130;
				if(change>0){
					System.out.println("The change is "+change);	
				}
			}
			break;
//		default :System.out.println("Not present in the vending Machine");break;	
		}
	}
	
	public void changeFinalState(VendingMachineState hasMoneyState){
		if (vendingMachineState instanceof NoMoneyState) {
			setVendingMachineState(hasMoneyState);
			System.out.println(
					"VendingMachine internal state has been moved to : " + vendingMachineState.getClass().getName());
		}
		dispenseProduct();
	}

	@Override
	public void dispenseProduct() {
		VendingMachineState noMoenyState = new NoMoneyState();
		vendingMachineState.dispenseProduct();

		/*
		 * Product has been dispensed so vending Machine changed the internal
		 * state to 'NoMoneyState'
		 */
		if (vendingMachineState instanceof HasMoneyState) {
			setVendingMachineState(noMoenyState);
			System.out.println(
					"VendingMachine internal state has been moved to : " + vendingMachineState.getClass().getName());
		}

	}

}