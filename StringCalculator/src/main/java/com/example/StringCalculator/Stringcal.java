package com.example.StringCalculator;

public class Stringcal {

    public static int add(String num)
    {
        if(num.isEmpty())
        {
            return 0;
        }

        return Integer.parseInt(num);
    }
}
