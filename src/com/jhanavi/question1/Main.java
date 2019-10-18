package com.jhanavi.question1;

import com.jhanavi.question1.ConvertResultToCSV;
import com.jhanavi.question1.DigitSquareSum;

public class Main {

    public static void main(String[] args) {
	    DigitSquareSum digitSquareSum = new DigitSquareSum();
	    String result = ConvertResultToCSV.convertToCSV(digitSquareSum.digitSquareSum());
	    System.out.print(result);
    }
}
