import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int exp = sc.nextInt();
    System.out.print(powr_of_numb(b,exp));
  }
  public static int powr_of_numb(int b,int exp)
  {
    int power = 1;
    while(exp>=1)
    {
      power = power * b;
      exp--;
    }
    return power;
  }
}