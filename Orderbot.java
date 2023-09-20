import java.util.Scanner;

public class Orderbot {
	
    public static void main(String args[]) {
        Item Mocha = new Item("Mocha", 3);
		Item Smoothie = new Item("Smoothie", 4);
		Item Americano = new Item("Americano", 2);
		Item Espresso = new Item("Espresso", 1);

		Scanner scnr = new Scanner(System.in);
		String userInput;
		System.out.println("Hi, welcome to Leefy coffy.");
		System.out.println("Our current menu:");
		Mocha.print_info();
		Smoothie.print_info();
		Americano.print_info();
		Espresso.print_info();

		System.out.println("Would you like to order?");
		userInput = scnr.nextLine();
		if(yes_or_no((userInput))){
			System.out.println("What would you like?");
			userInput = scnr.nextLine();
			switch (userInput) {
				case "Mocha":
					System.out.println("that would be $" + Mocha.price);
			}

		}
		System.out.print("Have a good day!");

    }

	public static boolean yes_or_no(String userInput) {
		if (userInput.charAt(0) == 'Y' || userInput.charAt(0) == 'y') {
			return true;
		}
		return false;
	}

}

