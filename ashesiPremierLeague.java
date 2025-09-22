import java.util.Scanner;

public class ashesiPremierLeague {
    public static void main(String[] args) {
        PlayerSelection.selectPlayer();
        }
    }

class PlayerSelection {
    static void selectPlayer(){
        // Task 1 - Declaring and Using Variables
        String name;
        int age;
        double heightInMetres;
        double weightInPounds;
        int jerseyNumber;
        String player_category = "";
        String eligibility;
        String position;
        String finalDecision;
        double pound = 0.45359237;
        double meter = 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Player Name: ");
        name = input.nextLine();

        System.out.print("Enter Player Age: ");
        age = input.nextInt();

        // Task 2 - Constants, Data Types and Type Casting
        System.out.print("Enter Player Height (in metres): ");
        heightInMetres = input.nextDouble();
        double heightInCentimetres = heightInMetres * meter;
        int height = (int) heightInCentimetres; 

        System.out.print("Enter Player Weight (in pounds): ");
        weightInPounds = input.nextDouble();
        double weightInKilograms = pound * weightInPounds;
        int weight = (int) weightInKilograms;

        System.out.print("Enter Player Jersey Number: ");
        jerseyNumber = input.nextInt();

        System.out.println();

        // Task 3 – Increment and Decrement Operators
        System.out.println(name +" is "+ age++ + " years old today");
        System.out.println("Next year, "+ name + " will be " + age + " years old");

        System.out.println();

        System.out.println("Penalty given against jersey number " + jerseyNumber--);
        System.out.println("New jersey number is " + jerseyNumber);

        System.out.println();
        --age;
        // Task 4 – Boolean Expressions and Logical Operators
        if(age>=18 && age<35 && weight<90) { 
            eligibility = "Eligible";
            // Task 5 – Selection Statements (if-else)
            if (age<20){
                player_category = "Rising Star";
            } else if (age>=20 && age<=30){
                player_category = "Prime Player";
            } else if (age>30){
                player_category = "Veteran";
            }
        } else{
            eligibility = "Not Eligible";
            if (age<18 || age>35){
            System.out.println("Player has a problem (either too young or too heavy)");
            }
        }

        System.out.println();

        // Task 6 – Switch Cases (Basic)
        ++jerseyNumber;
        switch(jerseyNumber){
            case 1: position = "Goalkeeper"; break;
            case 2,5: position = "Defender"; break;
            case 6,8: position = "Midfielder"; break;
            case 7,11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;

            default: position = "Player position not known"; break;
        }

        System.out.println("Player: " + name); 

        System.out.println("Age: " + age + " (" + player_category + ")");

        System.out.println("Height: " + height+"cm");

        System.out.println("Weight: " + weight+"kg");

        System.out.println("Jersey: " + jerseyNumber);

        System.out.println("Position: " + position); 
        if (position == "Striker" || position == "Winger" || position == "Playmaker"){
        System.out.println("Attacker jersey: Yes");
        } else {
        System.out.println("Attacker jersey: No");
        }
        System.out.println("Eligibility: " + eligibility);

        // Task 8 - Nested Ifs
        if (player_category == "Prime Player"){
            if (weight<80){
            System.out.println("Lineup Decsion: Play");
        }
            else {
            System.out.println("Lineup Decsion: Bench");
        }
    }
        // Task 9 - Conditional Expression (Ternary Operator)
        finalDecision = (eligibility == "Eligible" && weight<90)?"Play":"Rest";
        System.out.println("Final Decision: " + finalDecision);
    }
}
