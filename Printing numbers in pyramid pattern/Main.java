import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int count=0;
    	for(int i = 1; i<=n; i++){
    	    for(int space=1;space<=(n-i);space++){
    	        System.out.print(" ");
    	    }
    	    for(int j=1;j<=i;j++){
    	        count = count + 1;
    	        System.out.print(count+" ");
    	    }
    	    System.out.print("\n");
    	}
    }    
}