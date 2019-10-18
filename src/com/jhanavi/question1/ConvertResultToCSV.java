package com.jhanavi.question1;

import java.util.Map;

public class ConvertResultToCSV {

    public static String convertToCSV(Map<Integer,Integer> data){
        StringBuilder csvData = new StringBuilder();
        for (Integer key:
             data.keySet()) {
            csvData.append(key+","+data.get(key)+";");
        }
        return csvData.toString();
    }
}
