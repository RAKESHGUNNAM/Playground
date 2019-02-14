import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<=size-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int key1=sc.nextInt();
      int key2=sc.nextInt();
      int elem_1=-1;
      int elem_2=-1;
      for(int i=0;i<=size-1;i++)
      {
        if(key1==arr[i])
        {
          elem_1=i;
        }
        if(key2==arr[i])
        {
          elem_2=i;
        }
      }
      System.out.println(elem_1);
      System.out.println(elem_2);
    }
}