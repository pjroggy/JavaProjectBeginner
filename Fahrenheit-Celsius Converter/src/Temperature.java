public enum Temperature {
    CELSIUS("°C"), FAHRENHEIT("°F");

    public final String displayName;

    Temperature(String displayName) {
        this.displayName = displayName;
    }
}
