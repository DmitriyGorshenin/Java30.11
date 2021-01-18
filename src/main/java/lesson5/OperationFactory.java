package lesson5;

public class OperationFactory {

    private static Operation operation;

    public static Operation getOperation(Number a, Number b ) {
        if (a instanceof Integer && b instanceof Integer) {
            operation = new IntegerMathOperation();
        }
        if (a instanceof Double || b instanceof Double) {
            operation = new DoubleMathOperation();
        }

        return operation;
    }
}
