package practice;


interface Addition
{
	void add(int a,int b);
}

interface Subtraction
{
	void sub(int a,int b);
	
}
public class Mutiple_inheritance implements Addition,Subtraction {
	
	public void  add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
public static void main(String[] args) {
	
	
	Mutiple_inheritance m=new Mutiple_inheritance();
	m.add(3, 4);
	m.sub(5, 2);
}
}
