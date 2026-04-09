package FirstCalss16032026;

public class Swipping_TwoNumbers 
{
  
	public static void main(String[] args)
	{
		int a =10;
		int b =20;
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		//OR//
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("10-Swipping A Value is:"+ a);
		System.out.println("20-Swipping B Value is:"+ b);
	}
}
