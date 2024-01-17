import java.util.Scanner;

public class FahrenheitCelsiusConverter {
    private final Scanner scanner;
    private final TemperatureConverter converter;

    public FahrenheitCelsiusConverter(Scanner scanner, TemperatureConverter converter) {
        this.scanner = scanner;
        this.converter = converter;
    }

    private void conversion() {
        System.out.println("Entrez la température en %s".formatted(converter.source().displayName));
        double temperature = scanner.nextDouble();
        System.out.println("Egal à : %s %s".formatted(converter.convert(temperature), converter.target().displayName));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new FahrenheitCelsiusConverter(scanner, new CelsiusToFahrenheitConverter())
            .conversion();
        new FahrenheitCelsiusConverter(scanner, new FahrenheitToCelsiusConverter())
            .conversion();
    }
}
