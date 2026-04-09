package SecondClass17032026;

public class Largestof3Values 
{
   public static void main(String[] args)
   {
	   int a =20,b=30,c=40;
	   
	   /*int Largest1 = a>b? a:b;
	   int Largest2 = c>Largest1? c:Largest1;
	   System.out.println("Largest number = "+ Largest2);*/
	   // Largest Number
	   if (a>b && a>c)
	   {System.out.println("A Value is a Largest:"+a);}
	   else if (b>a && b>c)
	   {System.out.println("B Value is a Largest:"+b);}
	   else
	   {System.out.println("C Value is a Largest:"+c);}
		
	   // Smallest Number
	   
	   if (a<b && a<c)
	   {System.out.println("A Value is a Smallest:"+a);}
	   else if (b<a && b<c)
	   {System.out.println("B Value is a Smallest:"+b);}
	   else
	   {System.out.println("C Value is a Smallest:"+c);}
   }
}
