package com.jhanavi.question1;

import java.util.HashMap;
import java.util.Map;

public class DigitSquareSum {

    int start = 1;
    int end = 500;

    public Map<Integer,Integer> digitSquareSum(){
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=start;i<=end;i++){
            result.put(i,digitSquareSum(i));
        }
        return result;
    }

    public static int digitSquareSum(int n){
        int digitSquareSum = 0;
        int num = n;
        while (num>0){
            int d = num % 10 ;
            digitSquareSum = digitSquareSum + (d*d);
            num = num / 10 ;
        }
        return digitSquareSum;
    }
}
