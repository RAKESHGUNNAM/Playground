import java.util.Scanner;
class Main{
  public static int Sum_of_numb(int num)
  {
    int s = 0;
    for(int i=1; i<=num; i++)
    {
      s = s + i;
    }
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = Sum_of_numb(n);
      System.out.println(sum);
	}
}