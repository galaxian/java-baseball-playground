package calculator;

import java.util.Scanner;

public class Calculator {
    public int main(){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        sc.close();
        
        return inputArraySeparateCalculate(stringToArray(value));
    }

    public String[] stringToArray(String value) {
        return value.split(" ");
    }

    public int inputArraySeparateCalculate(String[] values) {
        int result = toInt(values[0]);
        for(int i = 0; i < values.length - 2; i+=2) {
            result = calculate(values[i+1], result, toInt(values[i+2]));
        }
        return result;
    }

    public int calculate(String operator, int firstValue, int secondValue) {
        if (operator.equals("+")) {
            return add(firstValue, secondValue);
        }
        if(operator.equals("-")) {
            return subtract(firstValue, secondValue);
        }
        if(operator.equals("*")) {
            return multiply(firstValue, secondValue);
        }
        if(operator.equals("/")) {
            return divide(firstValue, secondValue);
        }
        throw new IllegalArgumentException("4칙 연산의 연산자가 아닌 문자가 입력되었습니다.");
    }

    public int toInt(String input) {
        return Integer.parseInt(input);
    }

    public int add(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public int subtract(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public int divide(int firstValue, int secondValue) {
        try {
            return firstValue / secondValue;
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }
}
