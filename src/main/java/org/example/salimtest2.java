package org.example;

import java.util.Scanner;

//class InvalidYearException extends Exception{
//    public InvalidYearException(String errorMessage) {
//        super(errorMessage);
//    }
//}
class Vehicle {
    public String brand;
    public String model;
    public int year;
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public String vehicleSound() {
        return "vehicle sound";
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    public int numOfSeats;

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year);
        this.numOfSeats = numberOfSeats;
    }
    @Override
    public String vehicleSound() {
        return "Whooooosssshhh";
    }
    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Seat: " + numOfSeats);
    }
}
class Motorcycle extends Vehicle {
    public String hasBox;
    public Motorcycle(String brand, String model, int year, String hasBoxParam) {
        super(brand, model, year);
        this.hasBox = hasBoxParam;
    }

    @Override
    public String vehicleSound() {
        return "Ngeeeeennngggg";
    }
    public void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Box: " + hasBox);
    }
}

class InvalidYearException extends Exception
{

    // Constructor that accepts a message
    public InvalidYearException(String message)
    {
        super(message);
    }
}

public class salimtest2 {
    public static void main(String[] args) {
        try {
            Car car = new Car("Honda", "Jazz", 2020, 7);
            System.out.println("Description of Car:");
            car.displayCarInfo();
            System.out.println("Car Sound: " + car.vehicleSound());

            Motorcycle motorcycle = new Motorcycle("Honda", "Virza", 2022, "Yes");
            System.out.println("\nDescription of Motorcycle :");
            motorcycle.displayMotorcycleInfo();
            System.out.println("Motorcycle Sound: " + motorcycle.vehicleSound());


            int yearcar =  car.year;
            // car year validation
            if (yearcar < 2024) {
                throw new InvalidYearException("2024");
            }
        }catch(InvalidYearException e){
            System.out.println("Car is not brand new, because year of car is bellow "+e.getMessage());
        }finally {
            System.out.println("Car and Motorcycle was created successfully");
        }
    }
}