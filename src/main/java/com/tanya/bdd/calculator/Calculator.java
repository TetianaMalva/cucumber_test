package com.tanya.bdd.calculator;


public class Calculator {

    private Integer result;

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }


    public void subtract(int arg1, int arg2) {

        result = arg1 - arg2;
    }

    public void multiply(int arg1, int arg2) {

        result = arg1 * arg2;
    }
    public int getResult() {
        return result;
    }

}
