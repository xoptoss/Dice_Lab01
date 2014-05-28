package james.main;


import java.util.Random;

public class Dice {
	Random random = new Random();
	private static int Throws;
	private int value;
	int i=0;
	public Dice(int Throws){		
		Dice.Throws = Throws;
	}
	public void Throw() {
		if(Throws > 3){
			throw new IndexOutOfBoundsException();
		}
		while(i < Throws)
		{
			value += random.nextInt(6)+1;
			i++;
		}
		value = value/Throws;
		System.out.println("You rolled an avrage of:"+ value);
	}



}



