package calculator.Classes;
import calculator.Interfacses.ICalculator;
public class MyCalculator implements ICalculator {
    public int add(int x, int y) {
        return x + y;
    }
    public float divide(int x, int y) throws RuntimeException {
        if (y == 0) {
            throw new RuntimeException();
        }
        else {
            return (float) x / y;
        }
    }
}
