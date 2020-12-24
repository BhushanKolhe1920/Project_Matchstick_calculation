 
import java.io.*;
import java.util.*;
public class Main { 
	public static int MatchStick_Calculate(int x) 
	{ 
		x = 3*x*(x+1);
		x=x/2;

		return x;
//return (3 * x * (x + 1)) / 2; 
	} 
	public static void main(String[] args) 
	{ 
		 Scanner BK1920 = new Scanner(System.in);
		 System.out.println("Enter Height of Triangle i.e enter Floor Numbers");
		 int bk_input = BK1920.nextInt();
		 
		 System.out.print("Total number of matchstick required to make Triangular structure = ");
		 System.out.println(MatchStick_Calculate(bk_input));
	} 
} 