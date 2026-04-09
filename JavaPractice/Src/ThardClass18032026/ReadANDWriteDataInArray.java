package ThardClass18032026;

import java.util.Arrays;
import java.util.Scanner;

public class ReadANDWriteDataInArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter a value for the position "+i+ ":");
			a[i]=sc.nextInt();
		}
			System.out.println("Printing Array Element....");
			System.out.println(Arrays.toString(a));
		

	}

}
