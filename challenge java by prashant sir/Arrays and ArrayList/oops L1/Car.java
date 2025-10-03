
class Car {
    String color;
    String model;

    // Constructor
    Car(String c, String m) {
        color = c;
        model = m;
    }

    void display() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota");  // Constructor called
        Car car2 = new Car("Blue", "Honda");

        car1.display();  // Car model: Toyota, Color: Red
        car2.display();  // Car model: Honda, Color: Blue
    }
}

