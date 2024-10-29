import java.util.Scanner;
public class GuessingGame {
    public static void main(String[]args){
        int count = 0;
        int guess;
        int randn = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number 0 - 100");
        guess = input.nextInt();
        while(guess != randn){
            if(guess > randn){
                System.out.println("Too high!");
                System.out.println("Guess a number 0-100");
                guess = input.nextInt();  
                count += 1;      
            }
            else if (guess < randn){
                System.out.println("Too low!");
                System.out.println("Guess a number 0-100");
                guess = input.nextInt();
                count += 1;
            }
            
        }
        if(count<= 7){
            System.out.println("Good job! You got it in less than 8 guesses.");
        }
        else{
            System.out.println("You got it!");
        }
        
    }
}
