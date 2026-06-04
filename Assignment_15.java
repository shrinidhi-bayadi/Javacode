package module1;
/*WAP using switch case to display days of the week:1 for Monday,2 for Tuesday etc 7 for Sunday.
if the input is not in between 1-7 ,print "Invalid Day"*/

public class Assignment_15 {

	public static void main(String[] args) {

		int day = 5;

		switch (day)

		{
		case 1:
			System.out.println("It is Monday");
			break;

		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is Sunday");
			break;
		default:
			System.out.println("Invalid day!");
		}

	}
}
