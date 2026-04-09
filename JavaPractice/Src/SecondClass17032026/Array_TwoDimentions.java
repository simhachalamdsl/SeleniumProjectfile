package SecondClass17032026;

public class Array_TwoDimentions {

	public static void main(String[] args) {
		/*int a[][]= {{100,200},
				   {300,400},
		           {500,600},
		           {700,800}};*/
		
		int a[][]={{100,200},{300,400},{500,600},{700,800}};
		{
			System.out.println("Leanth of Array:"+a.length);
		}
		{
			System.out.println(a[2][1]);
		}
		    for (int r=0;r<=a.length-1;r++)
		{  
		    	for(int c=0;c<=1;c++)
		    	{
		    		System.out.println(a[r][c]);
		    	}
			
		}
			
	}
		
}
