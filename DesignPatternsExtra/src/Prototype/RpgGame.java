package Prototype;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RpgGame {
    public static void main(String[] args) {
        Character wizard = new Character("Gandalf", "Wizard", "A powerful wizard", Map.of("Strength", 10, "Intelligence", 20, "Wisdom", 15));
        Character warrior = new Character("Bazareanu", "Warrior", "A brave warrior", Map.of("Strength", 20, "Intelligence", 10, "Wisdom", 10));
        Scanner sc = new Scanner(System.in);

        boolean characterisChosen = false;

        while(!characterisChosen){
            System.out.println("You want to choose an existing character? (yes/no)");

            String answer = sc.nextLine();

            if (answer.equals("yes")){
                System.out.println("Pick the id of the character you want to play with: ");
                Character myCharacter = null;
                switch (sc.nextLine()){
                    case "0":
                        myCharacter = wizard.clone();
                        myCharacter.print();
                        characterisChosen = true;
                        break;
                    case "1":
                        myCharacter = warrior.clone();
                        myCharacter.print();
                        characterisChosen = true;
                        break;
                    default:
                        System.out.println("Invalid id");
                        break;
                }
                System.out.println("Do you want to modify the character? (yes/no)");

                String changeStats = sc.nextLine();

                if (changeStats.equals("yes")){
                    System.out.print("Name: ");
                    myCharacter.setName(sc.nextLine());
                    System.out.print("Class: ");
                    myCharacter.setClassType(sc.nextLine());
                    System.out.print("Story: ");
                    myCharacter.setStory(sc.nextLine());
                    myCharacter.print();

                }
                else if (changeStats.equals("no")){
                    myCharacter.print();
                }
                else{
                    System.out.println("Invalid answer");
                }
            }

            else if (answer.equals("no")){
                System.out.println("Create a new character: ");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Class: ");
                String classType = sc.nextLine();
                System.out.print("Story: ");
                String story = sc.nextLine();
                System.out.println("Attributes: ");
                System.out.println("Strength: ");
                int strength = sc.nextInt();
                System.out.println("Intelligence: ");
                int intelligence = sc.nextInt();
                System.out.println("Wisdom: ");
                int wisdom = sc.nextInt();
                Character newCharacter = new Character(name, classType, story, Map.of("Strength", strength, "Intelligence", intelligence, "Wisdom", wisdom));
                newCharacter.print();
                characterisChosen = true;
            }
            else{
                System.out.println("Invalid answer");
            }

        }
    }
}
