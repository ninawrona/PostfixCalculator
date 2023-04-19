import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Calculator calc = new Calculator();

        ArrayList<TokenInterface> arr = new ArrayList<>();
        arr.add(new Operator("*"));
        arr.add(new Operand(3));
        arr.add(new Operand(4));


        try {
           int result = calc.evaluateExpression(arr);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}