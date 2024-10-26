package com.example.StringCalculator;

public class Stringcal {

    public static int add(String num)
    {
        int sum=0;
        if(num.isEmpty())
        {
            return 0;
        }

        String addnum[]=num.split(",");

            for(String add:addnum)
            {
                sum+=Integer.parseInt(add);
            }
        return sum;
    }
}
