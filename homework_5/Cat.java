class Cat {
    // data fields
    private String name;
    private Integer weight;
    private String color;
    private boolean sleep;

    // default constructor
    public Cat() {
        this.name = "Cat";
        this.weight = 0;
        this.color = "Color";
        this.sleep = false;
    }

    // constructors
    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    public Cat(String name, Integer weight, String color, boolean sleep) {
        this(name, color);
        this.weight = weight;
        this.sleep = sleep;
    }

    // getter & setter for sleep
    public boolean isSleep() {
        return this.sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public void meow() {
        System.out.println(this.name + " says meow");
    }

    public String toString() {
        return "Cat name: " + this.name + "\nCat weight: " + this.weight + "\nCat color: " + this.color + "\nIs sleeping? " + isSleep() ;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat barsik = new Cat("Barsik", "red");
        Cat murka = new Cat("Murka", 4, "white", true);

        cat.meow();
        barsik.meow();
        murka.meow();
        murka.meow(murka);
    }

    public void meow(Cat cat) {
        if(!isSleep())
            System.out.println(this.name + " says meow");
        else
            System.out.println(this.name + " is sleeping");
    }
}