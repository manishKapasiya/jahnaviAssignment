package com.jhanavi.question3;

import com.jhanavi.question1.DigitSquareSum;

import java.util.*;

public class Question3 {

    int start = 1;
    int end = 10000000;
    List<Integer> loopingDigits = Arrays.asList(1,145,42,20,4,16,37,58,89);

    public List<String> digitSquareSum(){
        List<String> result = new ArrayList<>();
        for(int i=start;i<=end;i++){
            int sum = i;
            int count = 1;
            do {
                sum = DigitSquareSum.digitSquareSum(sum);
                if (sum == 89 && count>7) result.add(String.valueOf(i));
                count++;
            }while (!loopingDigits.contains(sum));
        }
        return result;
    }

    public static void main(String[] args){
        List<String> result = new Question3().digitSquareSum();
        System.out.print(String.join(",",result));
    }
}
