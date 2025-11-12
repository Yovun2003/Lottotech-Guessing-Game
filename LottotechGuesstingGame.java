import java.util.Random;
import java.util.Scanner;

public class LottotechGuesstingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //We will do an application whereby the user will need to guess a number.
        Random rand = new Random();

        int[] randomNumbers = new int[6];
        int attempts = 1;
        int matched=0;
        int guessed;
        int total;
        //The first number is inclusive and the second ont is exlusive
        //We can also use Math.random for this question
        // double randomNumber= (Math.random()*10)+1;
        //         randomNumber= (int)randomNumber;

        System.out.println("Number Guessing Game");
    // This will save the 6 random numbers into an array
        for(int i = 0; i <6; i++) {
            randomNumbers[i] = rand.nextInt(1, 41);

        }

        //Now we need to take the user's 6 numbers
        for(int j = 0; j <6; j++) {
            System.out.println("Enter your number you want to guess: ");
            guessed = scanner.nextInt();
            if (guessed >40) {
                System.out.println("Your number is too high");
                j--;
            } else if(guessed<1){
                System.out.println("Your number is too low");
                j--;
            }

            for(int num : randomNumbers) {
              
                if(guessed == num) {
                    matched++;
                }
            }
        }

        //Now we create the winning price using a switches
        switch(matched){
            case 3: total=400;
            break;
            case 4: total=2000;
            break;
            case 5: total=10000;
            break;
            case 6: total=5000000;
            break;
            default: total=0;
        }

        System.out.println("Number Guessed: " + matched +"\nYour total winnings are: RS " + total);

        }

    }



