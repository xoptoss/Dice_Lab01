package james.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



	public static void main(String[] args){
		int Throws;
		boolean Loop = true;
		Scanner tKeyboard = new Scanner(System.in);
		System.out.println("How many Dices would you like to roll?");
		Throws=tKeyboard.nextInt();

		Dice dice = new Dice(Throws);
		do{

			try {
				dice.Throw();
				Loop = false;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Too many throwss :^)");
			}

		}while(Loop);
	}

}


