import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int result = gcd_of_2_numb(n1,n2);
      System.out.print(gcd_of_2_numb(n1,n2));
	}
  public static int gcd_of_2_numb(int num1,int num2)
  {
    int min;
    if(num1<num2)
    {
      min=num1;
    }
    else{
      min=num2;
    }
    while(min>=1)
    {
      if((num1%min==0)&&(num2%min==0))
      {
        return min;
      }
      --min;
    }
    return 0;
  }
}