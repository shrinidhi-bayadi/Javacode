package practice1;

public class Stringbufferp2 {
	
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append("Test").reverse();
		System.out.println(sb); //tseTavaJ
		
		
		StringBuffer sb1 = new StringBuffer("Automation");
		sb1.delete(2,5).insert(2,"XX");
		System.out.println(sb1); //AuXXation
		
		
		StringBuilder sb3 = new StringBuilder("ABCDE");
		sb3.replace(1,4,"X");
		System.out.println(sb3); //AXE
		
		
		StringBuffer sb4 = new StringBuffer("Java");
		sb4.setLength(6);
		System.out.println(sb4.length()); //6
		System.out.println(sb4.charAt(4)); //null
		
		
		StringBuilder sb5 = new StringBuilder(3);
		sb5.append("abcd");
		System.out.println(sb5.capacity()); //8
		
		
		StringBuffer sb6 = new StringBuffer("ABC");
		StringBuffer sb7 = sb6.append("D");
		System.out.println(sb6 == sb7);  //true
		
		
		
		StringBuilder sb8 = new StringBuilder("Java");
		StringBuilder sb9 = new StringBuilder("Java");
		System.out.println(sb8.equals(sb9));  //false
		System.out.println(sb8==sb9); //false
		
		
		
		StringBuilder s = new StringBuilder("Testing");
		s.delete(0, s.length());
		System.out.println(s.length());
		System.out.println(s.capacity()); //0 and 23
		
		
		
		StringBuffer s1 = new StringBuffer();
		s1.ensureCapacity(17);
		System.out.println(s1.capacity());  //34
		
		
		StringBuilder s2 = new StringBuilder("Java");
		s2.insert(4,"X").insert(0,"Y");
		System.out.println(s2); //YJavaX
		
		StringBuffer s3 = new StringBuffer("ABC");
		s3.delete(1,1);
		System.out.println(s3); //ABC
		
		
		
		StringBuilder s4 = new StringBuilder("ABC");
		s4.replace(1,1,"XX");
		System.out.println(s4); //AXXBC
		
		
//		StringBuffer s5 = new StringBuffer("Java");
//		s5.setCharAt(4,'X');
//		System.out.println(s5); // run time eror
		
		
		StringBuilder s6 = new StringBuilder("Java");
		System.out.println(s6.substring(1,1));  //empty
		
		
//		StringBuffer s7 = new StringBuffer("ABC");
//		s7.insert(5,"X");
//		System.out.println(s7); // rte
//		
		
		
		StringBuilder s8 = new StringBuilder("Java");
		s8.append((String)null);
		System.out.println(s8); //Javanull
		
//		StringBuffer s9 = new StringBuffer("Java");
//		s9.append((char[])null);
//		System.out.println(s9); //rte
		
		
		StringBuilder b = new StringBuilder("ABCDE");
		b.delete(1,10);
		System.out.println(b);  //A
		
		
		
		StringBuffer b1 = new StringBuffer("Java");
		b1.ensureCapacity(10);
		System.out.println(b1.capacity()); //20
		
		StringBuilder b2 = new StringBuilder("ABC");
		b2.trimToSize();
		System.out.println(b2.capacity()); //3
		
		
		
		StringBuffer b3 = new StringBuffer("ABC");
		b3.setLength(0);
		b3.append("Java");
		System.out.println(b3); //java
		
		
		StringBuilder b4 = new StringBuilder("ABC");
		b4.append('D').append(10).append(false);
		System.out.println(b4); //ABCD10false
		
		
		
		StringBuffer b5 = new StringBuffer("Java");
		System.out.println(b5.lastIndexOf("a"));  //3
		
		
		
		StringBuilder b6 = new StringBuilder("Java");
		b6.deleteCharAt(b6.length() - 1);
		System.out.println(b6); //Jav
		
		
		StringBuffer b7 = new StringBuffer("ABC");
		b7.append("DEF");
		b7.replace(2,5,"X");
		System.out.println(b7); //ABXF
		

	}
}