import java.util.Scanner;

public class FahrenheitCelsiusConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la température en °C :");
        double temperatureCelsius = scanner.nextDouble();

        double conversionCelToFahr = celsiusToFahrenheit(temperatureCelsius);
        System.out.println("Egal à : " + conversionCelToFahr + " °F");

        System.out.println("Entrez la température en °F :");
        double temperatureFahrenheit = scanner.nextDouble();

        double conversionFahrToCal = fahrenheitToCelsius(temperatureFahrenheit);
        System.out.println("Egal à : " + conversionFahrToCal + " °C");
    }
}
