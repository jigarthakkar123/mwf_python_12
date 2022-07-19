import java.util.Scanner;

/*
 * while loop
 * 
 * while(condition)
 * {
 * 	body of the loop
 * }
 * 
 * -Entry controlled loop
 * -No semicolon after while
 * -If condition false at first then no execution
 * 
 * do
 * {
 * 	body of the loop;
 * }while(condition);
 * 
 * -Exit controlled loop
 * -Semicolon after while
 * -If condition false at first still minimum one time execution
 * */

public class WhileLoopDemo {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		do
		{
			sum=sum+n;
			n--;
		}while(n<0);
		System.out.println("Sum : "+sum);
	}
}
