package practice1;

public class IIB {

	static
    {
            System.out.println("SIB");
    }
    {
            System.out.println("IIB 1");
    }
    {
            System.out.println("IIB 2");
    }
    IIB()
    {
            System.out.println("Constrcutor 1");
    }
    IIB(int a)
    {
            System.out.println("Constrcutor 2");
    }
    public static void main(String[] args) 
    {
            System.out.println("Main Method");
            new IIB();
            new IIB(100);
            new IIB(100);

    }
}