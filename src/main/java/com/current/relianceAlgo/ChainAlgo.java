package com.current.relianceAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class ChainAlgo {

    public static void main (String[] args) {
        int count=0;
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                StringBuilder contents = new StringBuilder(2048);
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String inputLine="";
                while ((inputLine = bufferedReader.readLine()) != null) {
                    contents.append(inputLine);
                }
                System.out.println("CONTENTS " + contents);
                String newContent = contents.substring(9, contents.length()-2);
                System.out.println("CONTENTS LENGTH " + contents.length());
                System.out.println("CONTENTS " + newContent);

                String[] arr = newContent.split(",");
                System.out.println("ARRAY " + Arrays.toString(arr));
                for(int i=1; i<arr.length; i+=2){
                    String[] subparts = arr[i].split("=");
                    System.out.println("subparts " + Arrays.toString(subparts));
                    if (subparts[0].equals(" age") && Integer.parseInt(subparts[1]) >= 50) {
                        count++;
                    }
                }
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
        System.out.println(count);
    }
}
