import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ld = n % 10;
      int fd = n;
      while(n>=10)
        n = n / 10;
      fd = n;
      int sum = fd + ld;
      System.out.println(sum);
	}
}