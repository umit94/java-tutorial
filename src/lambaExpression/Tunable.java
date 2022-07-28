package lambaExpression;

@FunctionalInterface // Functional interface olduğunu belirten annotation, zorunlu değildir ama hataları önler.
public interface Tunable {
    void tune(String note);

}
