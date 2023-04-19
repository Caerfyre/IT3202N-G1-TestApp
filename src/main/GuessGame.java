package main;
import java.util.Random;
import java.util.Scanner;
public class GuessGame {

    public int createRandomNum(){
        Random random = new Random();
        return  random.nextInt(100); 
    }

    public int getUserGuesses(){
        System.out.println("Guess a number between 1 and 100:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int checkGuess(int num, int guess){
        if(num == guess){
            System.out.println("Correct! You Guessed it!");
            return 0;
        }else if(num < guess){
            System.out.println("Too High! Try Again!");
            return 1;
        }else{
            System.out.println("Too Low! Try Again!");
            return 2;
        }
    }
    public static void main(String[] args) throws Exception {
        GuessGame game = new GuessGame();
        int num = game.createRandomNum();
        int guess = game.getUserGuesses();
        int result = game.checkGuess(num, guess);
        while(result != 0){
            guess = game.getUserGuesses();
            result = game.checkGuess(num, guess);
        }
    }
}
