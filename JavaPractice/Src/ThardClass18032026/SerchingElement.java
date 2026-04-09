package ThardClass18032026;


public class SerchingElement {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,10,10,50};
		int Search_element =100;
		boolean status=false;
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]==Search_element)
			{
		System.out.println("Element found");
		status=true;
		break;
			}
		}
   if (status==false)
	   System.out.println("Element Not Found");

        }
	}

