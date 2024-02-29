// Write a Java program that illustrates the concepts of interfaces, method overriding, and method overloading. Begin by defining an interface named Vehicle with two abstract methods: accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the Bicycle class, override the same methods to display messages specific to a bicycle's acceleration and braking. Additionally, implement method overloading in both classes by providing multiple versions of the accelerate() method, each accepting different parameters such as speed and duration. Finally, create a Main class to instantiate objects of both Car and Bicycle classes, test their overridden methods, and demonstrate method overloading by invoking different versions of the accelerate() method.

package Assingments.Assingment_CH12;

// // Define the Vehicle interface
// interface VehicleVe {
//     void accelerateA();
//     void brakeB();
// }

// // Car class implementing the Vehicle interface
// class Car implements VehicleVe {
//     @Override
//     public void accelerateA() {
//         System.out.println("Car is accelerating");
//     }

//     @Override
//     public void brakeB() {
//         System.out.println("Car is braking");
//     }

//     // Method overloading for accelerate() with different parameters
//     public void accelerateA(int speed) {
//         System.out.println("Car is accelerating at speed: " + speed + " km/h");
//     }

//     public void accelerateA(int speed, int duration) {
//         System.out.println("Car is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
//     }
// }

// // Bicycle class implementing the Vehicle interface
// class Bicycle implements VehicleVe {
//     @Override
//     public void accelerateA() {
//         System.out.println("Bicycle is speeding up");
//     }

//     @Override
//     public void brakeB() {
//         System.out.println("Bicycle is slowing down");
//     }

//     // Method overloading for accelerate() with different parameters
//     public void accelerateA(int speed) {
//         System.out.println("Bicycle is accelerating at speed: " + speed + " km/h");
//     }

//     public void accelerateA(int speed, int duration) {
//         System.out.println("Bicycle is accelerating at speed: " + speed + " km/h for " + duration + " seconds");
//     }
// }

// // Main class to test the Vehicle interface, method overriding, and method overloading
// public class Q8 {
//     public static void main(String[] args) {
//         // Instantiate objects of Car and Bicycle classes
//         Car car = new Car();
//         Bicycle bicycle = new Bicycle();

//         // Test overridden methods
//         car.accelerateA();
//         car.brakeB();

//         bicycle.accelerateA();
//         bicycle.brakeB();

//         // Test method overloading
//         car.accelerateA(60);
//         car.accelerateA(80, 10);

//         bicycle.accelerateA(20);
//         bicycle.accelerateA(30, 5);
//     }
// }

interface Vehicle8 {
    void accelerate8();
    void brake8();
}

class Car8 implements Vehicle8 {
    @Override
    public void accelerate8() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake8() {
        System.out.println("Car is braking.");
    }

    public void accelerate8(int speed) {
        System.out.println("Car is accelerating atspeed: " + speed + " km/h.");
    }

    public void accelerate8(int speed, int duration) {
        System.out.println("Car is accelerating atspeed: " + speed + " km/h for " + duration + "seconds.");
    }
}

class Bicycle8 implements Vehicle8 {
    @Override
    public void accelerate8() {
        System.out.println("Bicycle is speeding up.");
    }

    @Override
    public void brake8() {
        System.out.println("Bicycle is slowing down.");
    }

    public void accelerate8(int speed) {
        System.out.println("Bicycle is accelerating atspeed: " + speed + " km/h.");
    }

    public void accelerate8(int speed, int duration) {
        System.out.println("Bicycle is accelerating atspeed: " + speed + " km/h for " + duration + "seconds.");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car8 myCar1 = new Car8();
        Bicycle8 myBicycle1 = new Bicycle8();
        
        myCar1.accelerate8();
        myCar1.brake8();

        myBicycle1.accelerate8();
        myBicycle1.brake8();

        myCar1.accelerate8(60);
        myCar1.accelerate8(80, 10);

        myBicycle1.accelerate8(20);
        myBicycle1.accelerate8(30, 5);
    }
}