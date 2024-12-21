import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		int yearOfBirth, remainder;
		Scanner input = new Scanner(System.in);

		System.out.print("Your Birth Year: ");
		yearOfBirth = input.nextInt();
		remainder = yearOfBirth % 12;

		switch (remainder) {
		case 0:
			System.out.print("Chinese Zodiac: Monkey");
			break;
		case 1:
			System.out.print("Chinese Zodiac: Cockerel");
			break;
		case 2:
			System.out.print("Chinese Zodiac: Dog");
			break;
		case 3:
			System.out.print("Chinese Zodiac: Pig");
			break;
		case 4:
			System.out.print("Chinese Zodiac: Mouse");
			break;
		case 5:
			System.out.print("Chinese Zodiac: Ox");
			break;
		case 6:
			System.out.print("Chinese Zodiac: Tiger");
			break;
		case 7:
			System.out.print("Chinese Zodiac: Rabbit");
			break;
		case 8:
			System.out.print("Chinese Zodiac: Dragon");
			break;
		case 9:
			System.out.print("Chinese Zodiac: Snake");
			break;
		case 10:
			System.out.print("Chinese Zodiac: Horse");
			break;
		case 11:
			System.out.print("Chinese Zodiac: Sheep");
			break;
		default:
			System.out.print("Incorrect Data");
		}

	}

}
