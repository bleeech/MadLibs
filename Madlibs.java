import java.util.Scanner;

public class Madlibs{
    
    public static void main(String[] args){
        madlibs();
    }

    public static void madlibs(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String word = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        // Cleaning the word so it has the first letter capitalized and the rest in lowercase
        String cleanWord = word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase();
        // creating a int variable to store the middle index of the cleanWord
        int mid = cleanWord.length() / 2;
        // Nickname is the first half of the cleanWord + "inator"
        String nickname = cleanWord.substring(0, mid) + "inator";
        // Splitting the cleanWord into two halves
        String firsthalf = cleanWord.substring(0, mid);
        String secondhalf = cleanWord.substring(mid);

        // Prompting the user to enter a title for the story
        System.out.print("Enter Title: ");
        String storyTitle = input.nextLine();
        // Title of the story could be the nickname + " and the " + adjective + " " + secondhalf??
        // Printing the story title and the story
        System.out.println(storyTitle);
        // Printing the story 
        System.out.println("Once upon a time, there was a " + adjective + " " + cleanWord + " who lived in a forest.");
        System.out.println("One day, " + cleanWord + " met a " + adjective + "" + secondhalf + " who was very friendly.");
        System.out.println("They became best friends and went on many adventures together.");
        System.out.print("Then there was a creature called " + firsthalf + " who was very scary.");
        System.out.println(" But " + nickname + " and " + adjective + "" + secondhalf + " were brave and defeated the " + firsthalf + ".");
        System.out.println("The end.");
    }
        
}