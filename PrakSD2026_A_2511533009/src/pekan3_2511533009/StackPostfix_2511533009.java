package pekan3_2511533009;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511533009 {
    public static int postfixEvaluate(String expression){
        Stack<Integer> s_3009 = new Stack<Integer>();
        Scanner input_3009 = new Scanner(expression);
        while (input_3009.hasNext()){
            if (input_3009.hasNextInt()) {         // an operand (integer)
                s_3009.push(input_3009.nextInt()); 
            } else {                               // an operator
                String operator_3009 = input_3009.next();
                int operand2_3009 = s_3009.pop();
                int operand1_3009 = s_3009.pop();
                if (operator_3009.equals("+")){
                    s_3009.push(operand1_3009+operand2_3009);
                } else if (operator_3009.equals("-")){
                    s_3009.push(operand1_3009-operand2_3009);
                } else if (operator_3009.equals("*")){
                    s_3009.push(operand1_3009*operand2_3009);
                } else{
                    s_3009.push(operand1_3009/operand2_3009);
                }
            }
        }
        input_3009.close();
        return s_3009.pop();
    }
    public static void main(String[] args ){
        System.out.println("hasil postfix= " + postfixEvaluate("5 2 4 * + 7 -"));
    }
}
