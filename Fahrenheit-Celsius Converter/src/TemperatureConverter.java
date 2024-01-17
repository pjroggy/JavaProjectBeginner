public abstract class TemperatureConverter {
    abstract double convert(double temperature);
    abstract Temperature source();
    abstract Temperature target();
}
