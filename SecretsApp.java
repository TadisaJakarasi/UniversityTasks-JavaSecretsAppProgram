/*
 * @author Tadisa Jakarasi
 * @date 25/06/2024
 * Week 4- Lab Task
 */




import java.util.Scanner;

public class SecretsApp {

        public static void main(String[] args) {
            // Declaring the variables
            int level; // whole numbers only
            Scanner keyboard = new Scanner(System.in); // creating the scanner object
            System.out.print("Enter security level: ");
            level = keyboard.nextInt(); //input method for security level
            switch (level) // switch selection used as there are multiple options
            {
                case 1: System.out.println("The security guard is a robot.");
                                      break;
                case 2: System.out.println("The security guard is a robot.");
                        System.out.println("There is a secret room in the basement.");
                                      break;
                case 3: System.out.println("The security guard is a robot.");
                        System.out.println("There is a secret room in the basement.");
                        System.out.println("The cook is an alien."); break;
                default: System.out.println("NO SUCH LEVEL");
            }
            System.out.println("END OF PROGRAM");


        }
    }
