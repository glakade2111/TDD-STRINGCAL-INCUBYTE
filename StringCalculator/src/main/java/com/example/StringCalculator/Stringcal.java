package com.example.StringCalculator;

public class Stringcal {

    public static int add(String num)
    {
        int sum=0;
        if(num.isEmpty())
        {
            return 0;
        }

    String delimeter="\n|,";


        String addnum[]=num.split(delimeter);


            for(String add:addnum)
            {
                if(Integer.parseInt(add)>0) {
                       sum += Integer.parseInt(add);
                }else {

                    throw new IllegalArgumentException("Negative numbers");
                }
            }

        return sum;
    }

}
