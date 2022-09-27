package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

protected double result; 

public double getResult() {

    return result;

}


public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

}

public void setResult(double value) {

    this.result = value;

}

public void add(double num1, double num2){

    double result = num1 + num2;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}


public void subtract(double num1, double num2){

    double result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}

public final void multiply(double num1, double num2)
{
    double result=num1*num2;

    if((result == Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.POSITIVE_INFINITY) || (result == -Double.MAX_VALUE)){

        throw new ArithmeticException("Double overflow");

    }
    this.result=result;
}


public final void divide(double num1, double num2){

    if(num2 == 0.0){

        throw new ArithmeticException("Divide By Zero");

    }

    result = num1 / num2;

}






}
