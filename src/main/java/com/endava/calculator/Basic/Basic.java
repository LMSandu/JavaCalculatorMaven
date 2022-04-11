package com.endava.calculator.Basic;

public class Basic implements BasicOperations {

    public static void main(String[] args) {
    }

    protected int decimals;

    public Basic() {
        decimals = 10;
    }

    public Basic(int decimals) {
        this.decimals = decimals;
    }

    @Override
    public long add(int... no) {
        int sum = 0;
        for (int element : no) {
            sum += element;
        }
        return sum;
    }

    @Override
    public long add(long... no) {
        long sum = 0;
        for (long element : no) {
            sum += element;
        }
        return sum;
    }

    @Override
    public double add(double... no) {
        double sum = 0;
        for (double element : no) {
            sum += element;
        }
        return formatDouble(sum);
    }

    @Override
    public int substract(int... no) {
        int sub = no[0];
        for (int i = 1; i < no.length; i++) {
            sub -= no[i];
        }
        return sub;
    }

    @Override
    public long substract(long... no) {
        long sub = no[0];
        for (int i = 1; i < no.length; i++) {
            sub -= no[i];
        }
        return sub;
    }

    @Override
    public double substract(double... no) {
        double sub = no[0];
        for (int i = 1; i < no.length; i++) {
            sub -= no[i];
        }
        return formatDouble(sub);
    }

    @Override
    public long multiply(int... no) {
        long result = 1;
        for (int element : no) {
            result *= element;
        }
        return result;
    }


    @Override
    public long multiply(long... no) {
        long result = 1;
        for (long element : no) {
            result *= element;
        }
        return result;
    }

    @Override
    public double multiply(double... no) {
        double result = 1;
        for (double element : no) {
            result *= element;
        }
        return formatDouble(result);
    }

    @Override
    public double divide(int... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result = result / no[i];
        }
        return formatDouble(result);
    }

    @Override
    public double divide(long... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result = result / no[i];
        }
        return formatDouble(result);
    }

    @Override
    public double divide(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result = result / no[i];
        }
        return formatDouble(result);
    }

    protected double formatDouble(double n) {
        String s = String.format("%." + decimals + "f", n);
        return Double.parseDouble(s);
    }
}
