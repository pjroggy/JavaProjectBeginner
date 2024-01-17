public class CelsiusToFahrenheitConverter extends TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }

    @Override
    Temperature source() {
        return Temperature.CELSIUS;
    }

    @Override
    Temperature target() {
        return Temperature.FAHRENHEIT;
    }
}
