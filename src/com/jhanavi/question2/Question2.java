package com.jhanavi.question2;

import com.jhanavi.question1.DigitSquareSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

    int start = 1;
    int end = 500;
    List<Integer> loopingDigits = Arrays.asList(1,145,42,20,4,16,37,58,89);

    public List<String> digitSquareSum(){
        List<String> result = new ArrayList<>();
        for(int i=start;i<=end;i++){
            int sum = i;
            do {
                sum = DigitSquareSum.digitSquareSum(sum);
                if (sum == 1) result.add(String.valueOf(i));
            }while (!loopingDigits.contains(sum));
        }
        return result;
    }

    public static void main(String[] args){
        List<String> result = new Question2().digitSquareSum();
        System.out.print(String.join(",",result));
    }
}
