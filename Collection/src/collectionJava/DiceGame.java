package collectionJava;
import java.util.Scanner;
import java.util.Random;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("1.Play");
		System.out.println("2.Drop");
		System.out.println("Choose your option:");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option) {
		case 1:
			System.out.println("Player 1");
			int dice1 = random.nextInt(6)+1;
			System.out.println("You rolled a "+dice1);
			System.out.println("Player 2");
			int dice2 = random.nextInt(6)+1;
			System.out.println("You rolled a "+dice2);
			if(dice1>dice2) {
				System.out.println("Player 1 wins");
			}else if(dice2>dice1) {
				System.out.println("Player 2 wins");
			}else {
				System.out.println("Tie");
			}
			break;
		case 2:
			System.out.println("Game over");
			break;
		}
		sc.close();

	}

}
