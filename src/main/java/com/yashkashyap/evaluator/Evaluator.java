package com.yashkashyap.evaluator;

public class Evaluator
{
    private double result;

    public Evaluator()
    {

    }

    public void evaluate(double num1,double num2,char expr)
    {
        switch(expr)
        {
            case '+':result=num1+num2;break;
            case '-':result=num1-num2;break;
            case '*':result=num1*num2;break;
            case '/':result=num1/num2;break;
            default:
        }
    }
    
    public void displayResult()
    {
        System.out.println("Result To the above is :"+result);
    }
}