package SecondClass17032026;

public class Arrary_singleDimentionArrary {

	public static void main(String[] args) {
		
		/* int a[] =new int[5];
		a[0]=100; //Index0
		a[1]=200; //Index1
		a[2]=300; //Index2
		a[3]=400; //Index3
		a[4]=500; //Index4
		*/
		int a[]= {100,200,300,400,500,600,700};
		{
			System.out.println("Leanth of Array:"+a.length);
		}
		{
		   System.out.println(a[4]);	
		}
		{
			for(int i=0;i<=a.length-1;i++)
			{
				System.out.println(i);
			}
			
				for(int x:a)
				{
					System.out.println(x);
				}
		}

	}

}
