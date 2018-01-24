package simulatingVendingMachine;

public class NoMoneyState implements VendingMachineState
{

  @Override
  public void selectProductAndInsertMoney( int amount, String productName )
  {
    System.out.println(amount + "cents has been inserted and " + productName + " has been selected...");

  }

  @Override
  public void dispenseProduct()
  {
    System.out.println("Vending Machine cannot dispense product because money is not inserted and product is not selected...");

  }

}