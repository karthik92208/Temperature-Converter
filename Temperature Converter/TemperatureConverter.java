package Task2;

import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double temp){
        return (temp * 9/5) + 32;
    }
    public static double fahrenheitToCelsius(double temp){
        return (temp - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;

        System.out.println("🔥 TEMPERATURE CONVERTER 🔥");

        while (true) {
            System.out.println("\nChoose one option from the below : \n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. exit or stop.\n");
            System.out.print("Option : ");

            //User input Validation
            if(!input.hasNextInt()){
                System.out.println("Invalid input! Please enter a numeric value..");
                input.next();
                continue;
            }

            int option = input.nextInt();

            if (option == 1) {
                System.out.print("Please enter the value to be converted : ");
                //input validation
                if(!input.hasNextDouble()){
                    System.out.println("Invalid Input! Please enter the temperature in numeric values..");
                    input.next();
                    continue;
                }
                double temperature = input.nextDouble();
                result = celsiusToFahrenheit(temperature);
                System.out.println("\n" + temperature + "°C = " + result + "°F");
            } else if (option == 2) {
                System.out.print("Please enter the value to be converted : ");
                //input validation
                if(!input.hasNextDouble()){
                    System.out.println("Invalid Input! Please enter the temperature in numeric values..");
                    input.next();
                    continue;
                }
                double temperature = input.nextDouble();
                result = fahrenheitToCelsius(temperature);
                System.out.println("\n" + temperature + "°F = " + result + "°C");
            } else if (option == 3) {
                System.out.println("TEMPERATURE CONVERTER exited.. Thank you...");
                break;
            } else System.out.println("Please select a valid option from the menu..");
        }
        input.close();
    }
}