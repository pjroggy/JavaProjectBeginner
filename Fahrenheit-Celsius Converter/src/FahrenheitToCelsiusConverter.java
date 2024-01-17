public class FahrenheitToCelsiusConverter extends TemperatureConverter {

    @Override
    public double convert(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    @Override
    Temperature source() {
        return Temperature.FAHRENHEIT;
    }

    @Override
    Temperature target() {
        return Temperature.CELSIUS;
    }
}
