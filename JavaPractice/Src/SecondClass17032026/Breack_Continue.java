package SecondClass17032026;

public class Breack_Continue {

	public static void main(String[] args)
	{
		for (int i =1; i<=10; i++)
		// It will stop the iteration ones condition is Satisfy
			/*{
			if (i==5)
			{
				break;
			}
			System.out.println(i);
		}*/
		// to skip the value if condition is satisfy
		{
			if (i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
