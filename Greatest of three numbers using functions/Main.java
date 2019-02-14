import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
      int result = greatest_of_2_numb(n1,n2);
      System.out.print(greatest_of_2_numb(result,n3));
	}
  public static int greatest_of_2_numb(int num1,int num2)
  {
    int max = 0;
    if(num1>num2)
    {
      max = num1;
    }
    else{
      max=num2;
    }
    return max;
  }
}