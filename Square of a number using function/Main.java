import java.util.Scanner;
class Main
{
  public static int Square(int m)
  {
    int sqr_root = m * m;
    return sqr_root;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sqr = Square(n);
      System.out.println(sqr);
	} 
}