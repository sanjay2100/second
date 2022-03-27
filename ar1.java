import java.util.Scanner;
import java.util.Arrays;

class ar1
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number of array elements");
int n= sc.nextInt();
int a[]=new int[100];

System.out.println("Enter the array elements");
	//mychange
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}

//Arrays.sort(a);
System.out.println("The array elements are");
for(int i=0;i<n;i++)
{
	System.out.println(a[i]);

}


int c=a[0];
for (int i=0;i<n;i++)
{
	if(a[i]>c)
	c=a[i];
	
}
System.out.println("The greatest of the array is");
System.out.println(c);

}
}
