package com.endava.calculator.Expert;


import com.endava.calculator.Basic.BasicOperations;

public interface ExpertOperations extends BasicOperations {

    double pow(int base, int exponent);
    double root(int a);
    long fact(int a);
    long factRec(int a);
    double calculate(String s);
}
