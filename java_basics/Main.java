import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      // System.out.println("Hello World");

      // String theName = "Gab";
      // int age = 22;
      // String theFullName = theName + " Agoncillo";
      // System.out.println("Hi, my name is " + theFullName + " and my age is " + age);

      // for(int num = 0; num <= 10; num ++){
      //   if(num % 2 != 0 ) {
      //     System.out.print(num);
      //   }
      // }

      //Using a Scanner
      // System.out.println("Enter a number");
      // Scanner input = new Scanner(System.in);
      // int answer = input.nextInt();
      // System.out.println("Answer was: " + answer);

      //Random number
    //   Random random = new Random();
    //   int randomNumber = random.nextInt(100) + 1;
    //   System.out.println(randomNumber);

    // Guessing game
    // System.out.println("Welcome to GG(Guessing Game)?");
    // System.out.println("May I know your name?");
    
    // Scanner scanner = new Scanner(System.in);
    
    // String name = scanner.next();

    // System.out.println("Hello " + name);

    // System.out.println("Shall we start?");
    // System.out.println("\t1. Yes");
    // System.out.println("\t2. No");

    // int beginAnswer = scanner.nextInt();

    // while(beginAnswer != 1){
    //   System.out.println("Shall we start?");
    //   System.out.println("\t1. Yes");
    //   System.out.println("\t2. No");

    //   beginAnswer = scanner.nextInt();
    // }

    // Random random = new Random();
    // int a = random.nextInt(20) + 1;
    // System.out.println("Guess a number from 1 to 20");
    // int userInput = scanner.nextInt();

    // int timesTried = 0;
    // boolean hasWon = false;
    // boolean shouldFinish = false;

    // while(!shouldFinish){
    //   timesTried++;

    //   if(timesTried < 5){

    //       //Check if the user have a correct guess
    //       if(userInput == a){
    //         hasWon = true;
    //         shouldFinish = true;

    //       } else if(userInput > a){
    //         System.out.println("Guess lower");
    //         userInput = scanner.nextInt();
            
    //       } else {
    //         System.out.println("Guess higher");
    //         userInput = scanner.nextInt();
    //       }
    //   } else {
    //     shouldFinish = true;
    //   }
    // }
    
    // //if the user have won
    // if(hasWon){
    //   System.out.println("Congratulations. you've guessed " + timesTried + " times");
    // }
    // else{
    //   System.out.println("Game over. The answer is " + a);
    // }

      // OOP Programming 
      Phone realme = new Phone("IPHONe SX", 5, 5, 5);


      System.out.println(realme.getName());
    }
  }