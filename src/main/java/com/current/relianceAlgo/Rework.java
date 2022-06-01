package com.current.relianceAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

public class Rework {
    public static void main(String[] args) {
        int count = 0;
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                StringBuilder contentBuilder = new StringBuilder();
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));
                //String lines = contentReader.readLine();
                String lines = null;
                while ((lines = contentReader.readLine()) != null){
                    contentBuilder.append(lines);
                }
                String content = contentBuilder.substring(9, contentBuilder.length() - 2);
                String[] contentArray = content.split(",");
                for (int i = 1; i < contentArray.length; i+=2){
                    String[] arr = contentArray[i].split("=");
                    if (arr[0].equals(" age") && Integer.parseInt(arr[1]) >= 50){
                        count++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(count);



        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);

        // print map details
        System.out.println("HashMap: " + map.toString());

        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map.getOrDefault("y", 500);

        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);
        System.out.println("Updated HashMap: " + map.toString());

    }
}
