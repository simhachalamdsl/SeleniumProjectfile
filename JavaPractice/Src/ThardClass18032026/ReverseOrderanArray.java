package ThardClass18032026;

import java.util.Arrays;

public class ReverseOrderanArray 
{
  public static void main(String[] args)
  {
	  int a[]= {10,20,30,40,50,60};
	  System.out.println(Arrays.toString(a));
	  for (int i=a.length-1;i>=0;i--)
	  {
		  
		  System.out.println(a[i]);
	  }
  }
}
