
import java.util.Scanner;

public class FortuneTellerApp{

  public static void main(String[] args){
    System.out.println("Welcome to We Can Code IT's Fortune Teller App!");
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("What's your first name?");
    String firstName = input.nextLine();

    System.out.println("What's you last name?");
    String lastName = input.nextLine();

    System.out.println("Your name is: " + firstName + " " + lastName);
  }

}