
import java.util.Scanner;
public class SpanSum {
private static Scanner input=new Scanner(System.in);
public static void main(String[] args)
{
	int size,sum;
	System.out.println("enter array size:");
	size=input.nextInt();
	int[] array=new int[size];
	System.out.println("enter elements:");
	for(int i=0;i<array.length;i++)
	{
		array[i]=input.nextInt();
	}
	sum=spanSum(array);
	System.out.println(sum);
}
private static void add()
{
	int i1=5;
	int i2=10;
	int i3=i1*i2;
	System.out.println(i3);
}
private static int spanSum(int[] array) {
	int sum=0;
	for(int i=1;i<array.length-1;i++)
	{
	sum=sum+array[i];	
	}
	System.out.println("returning sum value");
	return sum;
}
}
