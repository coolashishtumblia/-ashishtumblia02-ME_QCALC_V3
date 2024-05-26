package com.crio.qcalc;

public class StandardCalculator {
    private int result = 0;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    public int getResult() {
        return result;
    }

    private void setResult(int value) {
        this.result = value;
    }

    public void add(int num1, int num2) {
        int value = num1 + num2;
        setResult(value);
    }

    public void subtract(int num1, int num2) {
        int value = num1 - num2;
        setResult(value);
    }

    public void multiply(int num1, int num2) {
        int value = num1 * num2;
        setResult(value);
    }

    public void divide(int num1, int num2) {
        // Add error handling for division by zero.
        if (num2 != 0) {
            int value = num1 / num2;
            setResult(value);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    public void clearResult(){
        result=0;
    }
    public void printResult() 
    {
        System.out.println(getResult());
    }
}
