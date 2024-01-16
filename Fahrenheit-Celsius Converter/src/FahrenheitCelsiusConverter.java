import java.util.Scanner;

public class FahrenheitCelsiusConverter {
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la température en °C :");
        double temperatureCelsiue = scanner.nextDouble();
        System.out.println("Egal à : " + celsiusToFahrenheit(temperatureCelsiue) + " °F");

        System.out.println("Entrez la température en °F :");
        double temperatureFahrenheit = scanner.nextDouble();
        System.out.println("Egal à : " + fahrenheitToCelsius(temperatureFahrenheit) + " °C");
    }
}
