package Example;

import java.util.Scanner;

public class Task_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Print the sum of all integers from 1 to n:");
    System.out.print("Enter n: ");
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i < n; i++) {
      System.out.print(i + "+");
      sum += i;
    }
    sum += n;
    System.out.print(n + "=" + sum + "\n");
  }
}