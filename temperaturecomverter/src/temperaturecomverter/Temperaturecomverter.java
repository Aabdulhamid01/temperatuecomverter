/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecomverter;

/**
 *
 * @author ANAS

*/
import java.util.Scanner;
public class Temperaturecomverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
         System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter unit (C or F): ");
        char unit = scanner.next().charAt(0);

        double convertedTemperature;

        if (unit == 'C' || unit == 'c') {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Equivalent temperature in Fahrenheit: " + convertedTemperature + "°F");
        } else if (unit == 'F' || unit == 'f') {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Equivalent temperature in Celsius: " + convertedTemperature + "°C");
        } else {
            System.out.println("Invalid unit. Please enter C or F.");
        }

        scanner.close();
         }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
        
    
         
         
     
      
                 
               
             
                 
        
    }
    
}
