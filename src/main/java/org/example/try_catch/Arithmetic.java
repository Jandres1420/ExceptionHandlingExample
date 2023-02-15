package org.example.try_catch;

import org.example.try_catch.exceptionsP.OperationException;

public class Arithmetic {

    public static int division(int dividend, int divisor) throws OperationException{
        if(divisor == 0 ){
            throw new OperationException("Dividing by zero");
        }return  dividend/divisor;
    }
}
