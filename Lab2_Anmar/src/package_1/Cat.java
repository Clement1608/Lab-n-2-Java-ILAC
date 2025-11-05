package package_1;

public class Cat extends Animal {
    private String type;
    private int food_need;
    private String color;

    public Cat (String name, int age,String type, int food_need, String color) {
        super(name,age,"Cat");
        this.type=type;
        this.food_need=food_need;
        this.color=color;
    }

    public Cat () {

    }

    @Override
    public void talk() {
        System.out.println("Meaow Meaow Meaow Meaow");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Type of cat : " + type + "\nAge : " + food_need + "\nColor of the fur : " + color);
    }
}


