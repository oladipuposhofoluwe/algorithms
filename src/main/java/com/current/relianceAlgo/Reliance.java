package com.current.relianceAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Reliance {

        public static void main (String[] args) {
            //System.setProperty("http.agent", "Chrome");
            try {
                URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
                try {
                    URLConnection connection = url.openConnection();
                    InputStream inputStream = connection.getInputStream();
                    System.out.println(simpleParseArrayProperty(getStringFromStream(inputStream), "hobbies") + " &&&&&&");
                } catch (IOException ioEx) {
                    System.out.println(ioEx);
                }
            } catch (MalformedURLException malEx) {
                System.out.println(malEx);
            }
        }

        public static String getStringFromStream(final InputStream inputStream) {
            StringBuilder contents = new StringBuilder(2048);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String inputLine="";
                while ((inputLine = bufferedReader.readLine()) != null) {
                    contents.append(inputLine);
                }
                bufferedReader.close();
            } catch (IOException ioEx) {
                System.out.println(ioEx);
                return null;
            }
            System.out.println("CONTENT " + contents.toString());
            return contents.toString();
        }

        public static String simpleParseArrayProperty(String json, final String propertyName) {
            if(json == null)
                return null;
            int lastIndex = json.lastIndexOf(String.format("\"%s\"", propertyName));
            json = json.substring(lastIndex);
            lastIndex = json.lastIndexOf("[");
            json = json.substring(lastIndex+1);
            return json
                    .replaceAll("[\\]}\"]", "")
                    .replaceAll("\\,", ", ")
                    .trim();
        }




}
