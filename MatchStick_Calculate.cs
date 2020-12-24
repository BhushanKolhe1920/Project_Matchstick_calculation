
using System; 

class GFG 
{ 
	// Function to ind missing number 
	static int MatchStickCalculate(int x) 
	{ 
		return (3 * x * (x + 1)) / 2; 
	} 

	public static void Main() 
	
	{ 
	    Console.WriteLine("Enter height of triangle in terms of matchstich height : ");
	    int bk_input =Convert.ToInt32(Console.ReadLine());
		Console.Write(MatchStickCalculate(bk_input)); 
	} 
} 

