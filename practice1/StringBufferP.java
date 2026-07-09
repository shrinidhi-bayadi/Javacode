package practice1;

public class StringBufferP {



        public static void main(String[] args) 
        {
        	StringBuffer sb=new StringBuffer("Java");
        	sb.append(100);
        	System.out.println(sb); //Java100
        	
        	
        	StringBuilder s1=new StringBuilder("Hello");
        	s1.setCharAt(0, 'Y');
        	System.out.println(s1); //Yello
        	
        	
        	StringBuffer b1=new StringBuffer();
        	System.out.println(b1.capacity()); //16
        	
        	StringBuilder s2=new StringBuilder("ABC");
        	System.out.println(s2.length()); //3
        	
        	
        	StringBuffer b2=new StringBuffer("Automation");
        	System.out.println(b2.substring(2, 6)); //toma
        	
        	StringBuilder s3=new StringBuilder("Java");
        	System.out.println(s3.delete(1, 3)); //Ja
        	
        	StringBuilder s4=new StringBuilder("ABC");
        	s4.reverse();
        	System.out.println(s4); //CBA
        	
        	StringBuffer b3=new StringBuffer("Test");
        	b3.insert(2, "XX");
        	System.out.println(b3);//TeXXst
        	
        	
        	StringBuilder s5=new StringBuilder("Java");
        	System.out.println(s5.capacity()); //4+16=20
        	
        	
        	StringBuilder s6=new StringBuilder();
        	s6.append(true);
        	System.out.println(s6);
        	System.out.println(s6.capacity()); //16
        	
        	
        	StringBuffer b4=new StringBuffer("Java");
        	b4.replace(1, 3,"XX");
        	System.out.println(b4); //JXXa
        	
        	
        	StringBuilder s7=new StringBuilder("Selenium");
        	System.out.println(s7.indexOf("e")); //1
        	
        	StringBuffer b5=new StringBuffer("ABC");
        	b5.deleteCharAt(1);
        	System.out.println(b5); //AC
        	
        	StringBuilder s8=new StringBuilder("Hi");
        	s8.append(10).append(true);
        	System.out.println(s8); //Hi10true
        	
        	
        	StringBuffer b6=new StringBuffer(5);
        	System.out.println(b6.capacity()); //5
        	
        	
        	StringBuilder s9=new StringBuilder("Java");
        	s9.setLength(2);
        	System.out.println(s9); //Ja
        	
        	
        	StringBuilder s10=new StringBuilder("ABC");
        	System.out.println(s10.charAt(1));//B
        	
        	StringBuffer b7=new StringBuffer("Test");
        	StringBuffer b8=b7;
        	b7.append("ing");
        	System.out.println(b8); //Testing
        	
        	
        	StringBuffer b9=new StringBuffer();
        	b9.append("Java");
        	System.out.println(b9.capacity()); //16
        		
        	
        	StringBuffer b10=new StringBuffer();
        	System.out.println(b10.capacity()); //16
        	
        	b10.append("abcdecfghijklmnopq"); //18 letters added now
        	
        	System.out.println(b10.capacity()); //16*2+2 =34
        	
        	
        	b10.append("1234567891234567891234"); // 22 more added  =40
        	
        	System.out.println(b10.capacity());//34*2+2=70
        	
        			
        	StringBuffer b11=new StringBuffer("java");
        	StringBuffer b12=b11;
        	b12.append("testing");
        	System.out.println(b11);//javatesting  both same object
        	System.out.println(b12);
        	
        	
        	b12.replace(1, 2, "f");
        	System.out.println(b12);//jfvatesting
        	
        	b12.deleteCharAt(4);
        	
        	System.out.println(b12);//jfvaesting
        	
        	b12.delete(1, 4); 
        	System.out.println(b12); //jesting
        	
        	b12.setCharAt(2, 'f'); //jefting
        	System.out.println(b12);
        	
        	
//        	StringBuffer b13=new StringBuffer("JavaTesing");
//        	b13.append(null);
//        	System.out.println(b13); //CTE 
        	
        	//The method append(Object) is ambiguous for the type StringBuffer
        	
        	StringBuilder sb1 = new StringBuilder("Hello");
        	sb1.replace(1,4,"XX");
        	System.out.println(sb1);
        }
}
