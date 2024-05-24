import java.util.Scanner;

public class BitwiseAddition {
  static int add(int x, int y) {
    int carry;

    while(y != 0) {
      carry = x & y; // Performing and AND operation on x and y produces the same pattern as that produced in the process of summing x and y
      x = x ^ y; // Performing an XOR operation on x and y produces the same pattern as that resulting from adding x and y
      y = carry << 1; // Once x and y are added together and stored in x, repeatedly add the carry to x and shift x until it reaches 0
    }

    return x;
  }

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers to be summed:");

    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println("The Result is: " + add(x, y));
    input.close();
  }
}
