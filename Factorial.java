import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	int n,fact=1;
	System.out.println("enter number");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of"+n+"="+fact);
}
}
