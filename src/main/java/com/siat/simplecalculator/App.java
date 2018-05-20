package com.siat.simplecalculator;

import com.siat.simplecalculator.controller.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Plus plus = new PlusDummy();
        Minus minus = new MinusDummy();
        Multiply multiply = new MultiplyDummy();
        Divide divide = new DivideDummy();
        Mod mod = new ModDummy();

        System.out.println( "Calculator" );
        System.out.println(plus.plus(1, 2));
        System.out.println(minus.minus(1, 2));
        System.out.println(multiply.multiply(1, 2));
        System.out.println(divide.divide(1, 2));
        System.out.println(mod.mod(1, 2));
    }
}
