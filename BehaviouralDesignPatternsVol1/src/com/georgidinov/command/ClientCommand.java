package com.georgidinov.command;

//Command Design Pattern
//Strong decoupling every message(method call) between objects is transferred into objects
//Main participants are:
//  The Receiver -> receives(executes) all the messages(Commands) in the form of objects
//called(forwarded) from the Invoker
//for each method in the receiver class there is corresponding class(concrete implementation)
//of the  Command interface  and every concrete implementation "HAS A" Receiver member variable
//inside the execute method the receiver calls its  corresponding(mind the class name) method;
//  The Invoker "HAS A" Command member variable or list of Command type
//sends calls to the Receiver via the command member variable
//  The Command is object who has specific method invocation purpose
//the method call is wrapped in object and that object is the Command interface
//concrete implementation
//
class ClientCommand {

    public static void main(String[] args) {

        System.out.println("\n\t\t\t<<<Command Design Pattern>>>\n");
        //initializing all participants: Receiver, Command, Invoker
        //receiver of the command
        AbstractStockReceiver receiver = new ConcreteStockReceiver("Milk", 100);

        //initializing concrete commands(orders)
        //again for every method in the receiver class we have command object
        OrderCommand buyOrder = new BuyCommand(receiver);
        OrderCommand sellOrder = new SellCommand(receiver);

        //initializing the invoker
        BrokerInvoker invoker = new BrokerInvoker();

        //listing all the commands
        invoker.takeOrder(buyOrder);
        invoker.takeOrder(sellOrder);

        //iterate over the order(command) list and call execute on every command(order)
        invoker.placeOrder();
    }//end of main method

}//end of class ClientCommand
