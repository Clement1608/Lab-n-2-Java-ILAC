package package_1;

public class Animal {
    private String name;
    protected int age;
    public String species;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.species = "Unknown";
    }

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void talk (){
        System.out.println("Talking");
    }

    public static void eat(){
        System.out.println("Eating");
    }

    public void getInfo(){
        System.out.println("Name : " + name + "\nAge : " + age + "\nSpecies : " + species);
    }

    @Override
    public String toString() {
        return getName() + "," + age + "," + species;
    }


}
