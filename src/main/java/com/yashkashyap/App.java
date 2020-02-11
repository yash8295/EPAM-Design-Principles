package com.yashkashyap;

import java.util.*;
import com.yashkashyap.calculator.*;

public class App
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        double num1=0;double num2=0;char expr;

        System.out.println("Enter First Number");
        num1=scan.nextDouble();
        System.out.println("Enter Second Number");
        num2=scan.nextDouble();
        System.out.println("Enter operation(+,-,*,/) to perform :");
        expr=scan.next().charAt(0);
        
        Calculator calculator=new Calculator();
        
        calculator.solve(num1,num2,expr);
    }
}
