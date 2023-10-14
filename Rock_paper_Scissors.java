package projects;
import java.util.*;

public class Rock_paper_Scissors{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  userInput;
        Random r = new Random();

        //comp input
        int comp = r.nextInt(3)+1;
        int counter =0;
        int counter1 =0;
        System.out.print("Choose between\n(1)Rock\n(2)Paper\n(3)Scissors");
        for(int i =0;i<=2;i++) {
            System.out.print("\nEnter your Choice :- ");
            userInput = s.nextInt();
            System.out.println("Computer chooses " + comp);
            if (comp == userInput) {
                System.out.println("TIE");
            } else if (userInput == 1 && comp == 2 || userInput == 2 && comp == 3 || userInput == 3 && comp == 1) {
                System.out.println(" Computer wins ");
                counter1++;
            } else {
                System.out.println(" User win ");
                counter++;
            }
        }
        System.out.println("Total score --> "+counter);
        System.out.println();
        if(counter>counter1)
        {
            System.out.println("USER WINS FINALLY");
        }
        else {
            System.out.println("COMPUTER WINS FINALLY");
        }

    }
}
