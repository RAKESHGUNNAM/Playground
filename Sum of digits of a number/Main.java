import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n, sum = 0;
      while(temp!=0){
        int rem = temp % 10;
        sum = sum + rem;
        temp = temp / 10;
      }
      System.out.println(sum);
	}
}