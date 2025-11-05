package package_2;

import package_1.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondApp {
    public static void main(String[] args) {

       Cat Cat1 = new Cat("Bonzo", 19, "Ragdoll", 3, "Grey");
       Fish Fish1 = new Fish("Nougat",6, "Red Fish", 5, "Rectangular");
       Cat Cat2 = new Cat("Garfield",8,"Mainecoon", 2, "Brown");
       Fish Fish2 = new Fish("Bulle", 1,"Chinese Fish", 5, "Round");
       Animal Animal1 = new Animal("Jumper", 13, "Horse");
       Animal Animal2 = new Animal("Parmesan", 2, "Dog");

        Scanner scanner = new Scanner(System.in);
        Adoption adoptionCenter = new Adoption();
        boolean running = true;


        System.out.println("========== Welcome ==========");

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adopt an animal");
            System.out.println("2. Feed an animal");
            System.out.println("3. Show history");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        System.out.println("Which animal do you want to adopt?");
                        System.out.println("1. " + Cat1.getName() + " (" + Cat1.getSpecies() + ")");
                        System.out.println("2. " + Fish1.getName() + " (" + Fish1.getSpecies() + ")");
                        System.out.println("3. " + Cat2.getName() + " (" + Cat2.getSpecies() + ")");
                        System.out.println("4. " + Fish2.getName() + " (" + Fish2.getSpecies() + ")");
                        System.out.println("5. " + Animal1.getName() + " (" + Animal1.getSpecies() + ")");
                        System.out.println("6. " + Animal2.getName() + " (" + Animal2.getSpecies() + ")");

                        System.out.print("Enter number: ");
                        int animalChoice = scanner.nextInt();
                        scanner.nextLine();

                        Animal selectedAnimal = null;

                        switch (animalChoice) {
                            case 1 -> selectedAnimal = Cat1;
                            case 2 -> selectedAnimal = Fish1;
                            case 3 -> selectedAnimal = Cat2;
                            case 4 -> selectedAnimal = Fish2;
                            case 5 -> selectedAnimal = Animal1;
                            case 6 -> selectedAnimal = Animal2;
                            default -> {
                                System.out.println("Invalid number!");
                                break;
                            }
                        }

                        // only continue if a valid choice was made
                        if (selectedAnimal != null) {
                            System.out.print("Enter adopter's name: ");
                            String adopterName = scanner.nextLine();
                            adoptionCenter.adopt(selectedAnimal, adopterName);
                        }
                        break;

                    case 2:
                        System.out.println("Which animal do you want to feed?");
                        System.out.println("1. " + Cat1.getName() + " (" + Cat1.getSpecies() + ")");
                        System.out.println("2. " + Fish1.getName() + " (" + Fish1.getSpecies() + ")");
                        System.out.println("3. " + Cat2.getName() + " (" + Cat2.getSpecies() + ")");
                        System.out.println("4. " + Fish2.getName() + " (" + Fish2.getSpecies() + ")");
                        System.out.println("5. " + Animal1.getName() + " (" + Animal1.getSpecies() + ")");
                        System.out.println("6. " + Animal2.getName() + " (" + Animal2.getSpecies() + ")");
                        System.out.print("Enter number: ");

                        int animalChoice2 = scanner.nextInt();
                        scanner.nextLine();

                        Animal selectedAnimal2 = null;

                        switch (animalChoice2) {
                            case 1 -> selectedAnimal2 = Cat1;
                            case 2 -> selectedAnimal2 = Fish1;
                            case 3 -> selectedAnimal2 = Cat2;
                            case 4 -> selectedAnimal2 = Fish2;
                            case 5 -> selectedAnimal2 = Animal1;
                            case 6 -> selectedAnimal2 = Animal2;
                            default -> {
                                System.out.println("Invalid number!");
                                return;
                            }
                        }


                        System.out.print("Enter food portions: ");
                        int food = scanner.nextInt();
                        scanner.nextLine();


                        adoptionCenter.feed(selectedAnimal2, food);

                    case 3:
                        adoptionCenter.printAdoptionHistory();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exit program");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }


        }
        scanner.close();
    }
}

/*
while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Show all animals");
            System.out.println("2. Choose an animal by number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear buffer

                switch (choice) {
                    case 1:
                        showAnimals(animalList);
                        break;

                    case 2:
                        chooseAnimal(animalList, scanner);
                        break;

                    case 3:
                        running = false;
                        System.out.println("Exit program");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // prevent infinite loop
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

*/