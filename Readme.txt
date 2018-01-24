Readme


Step by step user guide is as mentioned below:
• The user can see interface of a vending machine
• Enter the Item and the cost in the given text pane.
• The products in the vending machine are shown in the list.
• Select product of your choice and click on the dispense product.
• Upon clicking on Dispense product the “check the console for the output” dialog box appears on the screen
• The states which the Vending machine travels are displayed along with the change.

Implementation

•Java is used for implementation of creating states for the vending Machine.
•Java swings have become handy in creating a User Interface to interact with the vending machine by the user.
•Each part of the program is defined in such a way that it is cohesive with the flow of the creation of the states of the vending machine.
•Nomoneystate and Hasmoneystate are created as abstract classes NoMoneyState and HasMoneyState which implements an interface VendingMachineState.
•VendingMachineState has only 2 methods without any implementation which would define the current state of the Vending Machine.Default, the application would be in NoMoneyState.
•Once the product is selected and amount is entered, if the amount entered is equal to the cost of product selected, the control immediately goes to the Dispenseproductstate.
•When the product is selected and amount is entered, if the amount entered is greater than the product cost, the control goes to Dispenseproductstate then the remaining amount  is returned, along with the product dispensed.
•Once the product is selected and amount is entered, if the amount entered is lesser than the cost of product selected, the control goes to HasMoneystate and the cost is validated,after this amount is sent back and the state is changed back to NoMoneyState.


Result/Analysis:
•	The design of vending machine based on state transition machine is studied.
•	Built a successful Vending Machine Simulator.
