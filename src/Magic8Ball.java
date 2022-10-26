import java.util.Scanner;

public class Magic8Ball
{
    public static void main(String[] args)
    {
        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";

        int random = (int)(Math.random()*6)+1;

        if (random==1){
            response = "Without a doubt";
        }
        if (random ==2){
            response = "It is decidedly so";
        }
        if (random ==3){
            response = "Better not to tell you now";
        }
        if (random ==4){
            response = "Concentrate and ask again";
        }
        if (random ==5){
            response = "Very doubtful";
        }
        if (random==6){
            response = "Don't count on it";
        }

        System.out.println(response);  // print response
    }
}

