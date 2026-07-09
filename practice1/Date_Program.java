package practice1;

import java.util.Date;

public class Date_Program {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime()); // Epoch date
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		String dateformat1 = d2.toString();
		System.out.println(dateformat1);
		String date = dateformat1.substring(8, 10);
		System.out.println("Date ->" + date);

		String month = dateformat1.substring(4, 7);
		System.out.println("Month-->" + month);
		String day = dateformat1.substring(0, 3);
		System.out.println("Day-->" + day);
		String hour = dateformat1.substring(11, 13);
		System.out.println("Hour-->" + hour);
		String minute = dateformat1.substring(14, 16);
		System.out.println("Minute-->" + minute);
		String second = dateformat1.substring(17, 19);
		System.out.println("Second-->" + second);
		String year = dateformat1.substring(24, 28);
		System.out.println("Year-->" + year);

//                //DD/MM/YYYY
//                //DD-MM-YYYY

		String format1 = date.concat(month).concat(year);
		System.out.println(format1);
		String format2 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format2);
		String format3 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		String format4 = month.concat("/").concat(date).concat("/").concat(year);
		System.out.println(format4);

	}
}