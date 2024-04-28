import java.util.Scanner;



public class App {
     
    public static void main(String[] args) throws Exception {
         
         
         Double number1, number2, result;
         try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter your operator");
            char operator = userInput.next().charAt(0);
            System.out.println("Enter 1st value");
            number1 = userInput.nextDouble();
            number2 = userInput.nextDouble();
            switch (operator){
                case '+':
                result = number1 + number2;
                case '-':
                result = number1 - number2;
                case '*':
                result = number1 * number2; 
                case '/':
                result = number1 / number2;

            }
        }
         System.out.println("Enter 2nd value");
    }
}
