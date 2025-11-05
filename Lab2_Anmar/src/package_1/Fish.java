package package_1;

public class Fish extends Animal {
    private String type;
    private int food_need;
    private String environment;

    public Fish() {
        super();
        this.type="Fish";
        this.food_need=0;
        this.environment="Unknown";
    }

    public Fish(String name, int age,String type, int food_need, String environment) {
        super(name,age, "Fish");
        this.type=type;
        this.food_need=food_need;
        this.environment=environment;
    }

    @Override
    public void talk() {
        System.out.println("blout blout blout blout");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Type of fish : " + type + "\nAmount of food they need : " + food_need + "\nAquarium : " + environment);
    }
}