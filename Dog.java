public class Dog {
    // Fields or instance variables
    String name;
    String breed;
    int age;
    String color;


    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Function to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
