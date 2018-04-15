import java.util.Scanner;

class UserInput
{

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      int sum;
      int average;
      int product;
      int smallest;
      int largest;
      
      System.out.print("Enter the first number >> ");
      number1 = input.nextInt();
      
      System.out.print("Enter the second number >> ");
      number2 = input.nextInt();
      
      System.out.print("Enter the thrid number >> ");
      number3 = input.nextInt();
      
      sum = number1 + number2 + number3;
      average = sum/3;
      product = number1 * number2 * number3;
      
      largest = number1;
      smallest = number1;
      
      if(number2 > largest)
         largest = number2;
        
      if(number3 > largest)
         largest = number3;
        
      if(number2 < smallest)
         smallest = number2;
         
      if(number3 < smallest)
         smallest = number3;
         
      System.out.println("The sum is: " + sum);
      System.out.println("The average is: " + average);
      System.out.println("The product is: " + product);
      System.out.println("The smallest number is: " + smallest);
      System.out.println("The largest number is: " + largest);
     }
}