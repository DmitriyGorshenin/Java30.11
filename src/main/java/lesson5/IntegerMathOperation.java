package lesson5;

public class IntegerMathOperation extends Operation {


    /**
     * TODO: 1. simple java types
     * TODO: 2. Classes
     * TODO:  3. OOP
     *           3.1 Inheritance
     *           3.2 Plymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is" + getClass());
        if(a instanceof Integer && b instanceof Integer){
            return sum(a, b);
        }
        return null;
    }


    public Integer sum(Integer a, Integer b){
        return a.intValue()+b.intValue();
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is" + getClass());
        if(a instanceof Integer && b instanceof Integer){
            return multiplication(a, b);
        }
        return null;
    }

    public Integer multiplication(Integer a, Integer b){
        return a.intValue()*b.intValue();
    }

    public Number divide(Number a, Number b){
        System.err.println("This is" + getClass());
        if(a instanceof Integer && b instanceof Integer){
            return divide(a, b);
        }
        return null;

    }
    public Integer divide(Integer a, Integer b){
        System.err.println("This is" + getClass());
        String message = "You can't divide by zero";
        Integer ZERO_NUMBER = 0;
        Integer result = ZERO_NUMBER;

        if(b.intValue() == ZERO_NUMBER.intValue()){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        result = a.intValue()/b.intValue();
        return result;
    }

    public Number difference(Number a, Number b){
        System.err.println("This is" + getClass());
        if(a instanceof Integer && b instanceof Integer){
            return difference(a, b);
        }
        return null;
    }
    public Integer difference(Integer a, Integer b){
        return a.intValue()-b.intValue();
    }
}
