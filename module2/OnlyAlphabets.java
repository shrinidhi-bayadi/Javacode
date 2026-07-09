package module2;

public class OnlyAlphabets 
{
       static int countOfAlpha=0;
       
       static int countOfNumeric=0;
       
       
       public static void main(String[] args) 
       {
               String input="house no 16 cauvery layout";
               System.out.println(input.length());
               char []c1=        input.toCharArray();
               for(int i=0;i<input.length();i++)
               {
               boolean b1=        Character.isAlphabetic(c1[i]);
               //System.out.println(b1);
                       if(b1)
                       {
                               countOfAlpha++;
                       }
               }
               System.out.println(countOfAlpha);
               if(countOfAlpha==input.length())
               {
                       System.out.println("The input String only conssiting of alphabes");
               }
               else
               {
                       System.out.println("The input String NOT only conssiting of alphabes");
               }

               
       }
}