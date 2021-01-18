package lesson5;

public abstract class Operation {
    public abstract Number sum(Number a, Number b);

    public abstract Number multiplication(Number a, Number b);

    public abstract Number divide(Number a, Number b);

    public abstract Number difference(Number a, Number b);

    public int mod(int a, int b){
        return a%b;
    }
}
