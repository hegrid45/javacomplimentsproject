// Importing required libraries
import java.util.Scanner;  // For user input
import java.util.Random;   // For generating random messages

// Main class
public class VirtualJar {
    public static void main(String[] args) {
        // Creating Scanner and Random objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Array of motivational compliments
        String[] motivational = {
            "You're doing amazing, keep going!",
            "You have the power to achieve anything.",
            "Every day is a fresh start."
        };

        // Array of funny compliments
        String[] funny = {
            "You're like a cloud... when you disappear, it's a beautiful day!",
            "You bring everyone so much joy… when you leave the room!",
            "You're not lazy, you're just on energy-saving mode."
        };

        // Array of poetic compliments
        String[] poetic = {
            "Roses are red, violets are blue, you're awesome, and you know it's true.",
            "Like the moon in the night, you light up lives so bright.",
            "You're the rhythm in my rhyme, the sparkle in my time."
        };

        // Array of roast-style compliments (bezzati style)
        String[] roast = {
            "You're the reason shampoo has instructions.",
            "You're not stupid; you just have bad luck thinking.",
            "You're the human version of a participation award."
        };

        // Displaying welcome message and options
        System.out.println("Welcome to the Virtual Jar of Compliments!");
        System.out.println("Choose a category:");
        System.out.println("1. Motivational");
        System.out.println("2. Funny");
        System.out.println("3. Poetic");
        System.out.println("4. Roast (bezzati style)");

        // Taking user input
        int choice = sc.nextInt();
        String message = "";

        // Selecting and displaying a random compliment based on user choice
        switch (choice) {
            case 1:
                message = motivational[rand.nextInt(motivational.length)];
                break;
            case 2:
                message = funny[rand.nextInt(funny.length)];
                break;
            case 3:
                message = poetic[rand.nextInt(poetic.length)];
                break;
            case 4:
                message = roast[rand.nextInt(roast.length)];
                break;
            default:
                message = "Invalid choice. Please select 1 to 4.";
        }

        // Displaying the final message
        System.out.println("\nHere's your message:");
        System.out.println(message);
    }
}
