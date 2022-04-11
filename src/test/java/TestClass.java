import com.endava.calculator.Basic.Basic;
import com.endava.calculator.Basic.BasicOperations;
import com.endava.calculator.Expert.Expert;
import com.endava.calculator.Expert.ExpertOperations;

public class TestClass {

    public static void main(String[] args) {
        BasicOperations b = new Basic(3);
        ExpertOperations e = new Expert(3);

        System.out.println("add:" + b.add(2, 3, 4));
        System.out.println(("substract:" + b.substract(2, -3, 5.2)));
        System.out.println(("multiply:"));
        System.out.println(b.multiply(2, 6, -2));
        System.out.println(b.multiply(3.5, 2.3, 2));
        System.out.println("divide:" + b.divide(10, 5, 3));
        System.out.println("pow:" + e.pow(2, -1));
        System.out.println("root:" + e.root(5));
        System.out.println("fact:" + e.fact(3));

        System.out.println(e.calculate("22.4 + 33 + 10"));

        System.out.println(e.calculate("-3+2"));
        System.out.println(e.calculate("2*(-3+2)"));
    }
}
