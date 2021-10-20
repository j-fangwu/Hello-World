import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        //Definition of scanner.
        Scanner scan = new Scanner(System.in);

        //Printing out conversation and defining user's input.
        System.out.print("Hello. What is your name? ");
        String name = scan.next();
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        String age = scan.next();
        System.out.print("I see that you are still quite young at only " + age + ".");
        System.out.print(" Where do you live? ");
        String place = scan.next();
        System.out.print("Wow! I've always wanted to go to " + place +  ". Thanks for chatting with me. Bye!");
    }
}
//comment - proof of commit. 
//End of program.