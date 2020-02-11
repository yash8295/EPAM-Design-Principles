package com.yashkashyap.calculator;

import com.yashkashyap.evaluator.*;

public class Calculator
{
    private Evaluator evaluator;
  
    public Calculator()
    {
        evaluator=new Evaluator();
    }
  
    public void solve(double num1,double num2,char expr) 
    {
      evaluator.evaluate(num1, num2, expr);
      evaluator.displayResult();
    }
}