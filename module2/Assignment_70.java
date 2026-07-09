
package module2;

import java.util.Date;

//WAP to print the date 5 days in the Past and 17 days in future time 
public class Assignment_70 {

	public static void main(String[] args) {
		
		Date d1=new Date();
		
		System.out.println("Current Time : "+d1);
		System.out.println("Epoch Time : "+d1.getTime()); //epoch time
		Date d2=new Date(d1.getTime()-(1000*60*60*24*5));
		
		System.out.println("Time 5 days in Past : "+d2);
		String dateformat1=d2.toString();
		
		String day5past=dateformat1.substring(8, 10);
		System.out.println("Date 5 days in Past is : "+day5past);
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*17));
		System.out.println("Time in 17 days future : "+d3);
		String dateformat2=d3.toString();
		
		String day17future=dateformat2.substring(8,10);
		System.out.println("Date 17 Days in future is : "+day17future);
	}
}
