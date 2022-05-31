package com.algorithm.relianceAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Rework2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            System.out.println();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getStringFromInputStream(InputStream stream) throws IOException {
        StringBuilder builder =new StringBuilder(2048);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            String lines = null;
            while ((lines = bufferedReader.readLine()) != null){
                builder.append(lines);
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println(e);
        }
        return builder.toString();
    }

    public static String simpleParseArrayProperty(String json, String propertyName){
        if (json == null){
            return null;
        }
        int lastIndex = json.lastIndexOf(String.format("\"%s\"", propertyName));
        json = json.substring(lastIndex);
        lastIndex = json.lastIndexOf("[");
        return null;
    }
}
