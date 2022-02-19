//Scanner module is used to accept values
import java.util.Scanner;
class Pattern {
  public static void main(String args[]) {
/*in is defined as scanner name to call the scanner
whenever it is required*/
    Scanner in = new Scanner(System.in);
    int a,b;
    System.out.print("Enter value for row: ");
    int i=in.nextInt();
    System.out.print("Enter value for column: ");
    int j=in.nextInt();
    for(a=1;a<=j;a++) {
      for(b=1;b<=i;b++) {
        System.out.print("*");
      }
      System.out.println();
    }
//Close function is inbuilt function call for Scanner
    in.close();
  }
}
