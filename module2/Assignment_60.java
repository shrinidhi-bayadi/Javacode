package module2;

/*
 * WAP  print Output in following format:
1 Student:
My Name is:->Ram 
My Initial is->A 
My rollNo is ->11
2 Student:
My Name is:->Sham 
My Initial is->W
My rollNo is ->53
3 Student:
My Name is:->Hari 
My Initial is->P
My rollNo is ->40

 */
public class Assignment_60 {
	public static void main(String[] args) {

		String[] name = new String[3];
		name[0] = "Ram";
		name[1] = "Sham";
		name[2] = "Hari";

		int[] rollNo = new int[3];
		rollNo[0] = 11;
		rollNo[1] = 53;
		rollNo[2] = 40;

		char[] initial = new char[3];

		initial[0] = 'A';
		initial[1] = 'W';
		initial[2] = 'P';

		for (int i = 0, j = 1; i < name.length; i++, j++) {

			System.out.println(j + "Student:");
			System.out.println("My name is:-> " + name[i]);
			System.out.println("My Initial is ->" + initial[i]);
			System.out.println("My Rollnumber is ->" + rollNo[i]);

		}

	}
}
