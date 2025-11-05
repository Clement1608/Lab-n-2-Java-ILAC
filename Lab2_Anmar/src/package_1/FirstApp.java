package package_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstApp {

    public static void main(String[] args) {
        // Create a list of animals
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Bonzo", 19, "Ragdoll", 3, "Grey"));
        animalList.add(new Fish("Nougat",6, "Red Fish", 5, "Rectangular"));
        animalList.add(new Cat("Garfield",8,"Mainecoon", 2, "Brown"));
        animalList.add(new Fish("Bulle", 1,"Chinese Fish", 5, "Round"));
        animalList.add(new Animal("Jumper", 13, "Horse"));
        animalList.add(new Animal("Parmesan", 2, "Dog"));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=========== Animal ============");
        Animal.eat(); // call static method

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

        scanner.close();
    }

    // 📋 Display all animals
    public static void showAnimals(ArrayList<Animal> list) {
        System.out.println("\n=========== All Animals ===========");
        int index = 1;
        for (Animal a : list) {
            System.out.println(index + ". " + a.getName() + " (" + a.getSpecies() + ")");
            index++;
        }
    }

    // 🐾 Choose an animal by its number
    public static void chooseAnimal(ArrayList<Animal> list, Scanner scanner) {
        try {
            showAnimals(list);
            System.out.print("\nEnter the animal number: ");
            int num = scanner.nextInt();

            if (num < 1 || num > list.size()) {
                System.out.println("Invalid number!");
                return;
            }

            Animal selected = list.get(num - 1);
            System.out.println("\n=== Selected Animal Information ===");
            selected.getInfo();
            selected.talk();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter a number.");
            scanner.nextLine(); // clear buffer
        }
    }
}

