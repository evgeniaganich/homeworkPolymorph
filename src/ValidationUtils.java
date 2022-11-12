public class ValidationUtils {
    public static String validOrDefault(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public static double validOrDefault(double value, double defaultValue) {
        return value <= 0 ? defaultValue : value;
    }

    public static int validOrDefault(int value, int defaultValue) {
        return value <= 0 ? defaultValue : value;
    }
}
