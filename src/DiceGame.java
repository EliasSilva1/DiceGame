import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args)
	{
	Scanner x = new Scanner(System.in);
	
	int dice_max,guess,random_number=0;
	

	System.out.println("Enter the number of dices you want to roll");
	dice_max= x.nextInt();
	
	for(int i=0; i<dice_max;i++)
	{
		random_number=random_number + RandomNumber.GetRandom();
	}
	
	System.out.println("Enter the number");
	guess=x.nextInt();
	
	boolean correct = (guess == random_number)?true:false;
	
	if(correct)
		System.out.println("You guess correct!");
	else
		System.out.println("You guess incorrect!");	
	}
}
