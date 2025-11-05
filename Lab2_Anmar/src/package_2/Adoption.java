package package_2;
import package_1.Animal;
import java.util.ArrayList;

public class Adoption implements MainInterface{

    private ArrayList<String> adoptionHistory = new ArrayList<>();

    @Override
    public void adopt(Animal animal, String adopterName) {
        try {
            if (animal == null) {
                throw new Exception("Animal cannot be null.");
            }
            if (adopterName == null || adopterName.isBlank()) {
                throw new Exception("Adopter name is invalid.");
            }

            String adoption = adopterName + " adopted " + animal.getName() + " (" + animal.getSpecies() + ")";
            adoptionHistory.add(adoption);
            System.out.println("Adoption successful: " + adoption);

        } catch (Exception e) {
            System.out.println("Error during adoption: " + e.getMessage());
        }
    }

    @Override
    public void feed(Animal animal, int foodAmount) {
        try {
            if (animal == null) {
                throw new Exception("Animal not found.");
            }
            if (foodAmount <= 0) {
                throw new Exception("Invalid food amount.");
            }

            System.out.println(animal.getName() + " has been fed " + foodAmount + " portions of food.");
            String feed = animal.getName() + " (" + animal.getSpecies() + ")" + " has been feed " + foodAmount + " portions of food.";
            adoptionHistory.add(feed);
        } catch (Exception e) {
            System.out.println("Error while feeding: " + e.getMessage());
        }
    }

    public void printAdoptionHistory() {

        System.out.println("===== History =====");

        if (adoptionHistory.size() <= 0) {
            System.out.println("No History");
        }
        else {
            for (String adoption : adoptionHistory) {
                System.out.println(adoption);
            }
        }
    }
}
