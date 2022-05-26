package com.algorithm.algorithm;

import org.apache.catalina.filters.RestCsrfPreventionFilter;
import org.apache.commons.lang3.time.DateUtils;

import javax.swing.plaf.IconUIResource;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algorithm {


    //Recursive method
    public int powerOfTwo(int n){
        if (n == 0){
            return 1;
        } else {
            int power = 2 * powerOfTwo(n - 1);
            return power;
        }
    }

    //Iterative method
    public int powerOfTwoIT(int n){
        int i = 0;
        int power = 1;
        while (i < n){
            power = power * 2;
            i = i + 1;
        }
        return power;
    }

    public int factorial(int n){
        if (n < 0){
            return -1;
        }

        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public void recursiveMethod(int n){
        if (n < 1){
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }

    public int fibonacci(int position){

        if (position == 0 || position == 1){
            return position;
        }

        if (position < 0){
            return -1;
        }

        return fibonacci(position - 1) + fibonacci(position - 2);
    }

    //finding the sum of digit of a positive number
    public int sumOfDigit(int number){
        if (number == 0 || number < 0){
            return 0;
        } else {
            return number%10 + sumOfDigit(number/10);
        }
    }

    // calculating the power of a number
    public int powerOfNumber(int number, int power){
        if (power == 0){
            return 1;
        } else if (number == 0){
            return 0;
        } else if(power < 0){
            return -1;
        } else {
            return number * powerOfNumber(number, power - 1);
        }
    }

    // calculating the greatest Common Divisor
    public int greatestCommonDivisor(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        if (b == 0){
            return a;
        }
        return greatestCommonDivisor(b, a%b);
    }

    //converting decimal to number
    public int decimalToBinary(int n){
        if (n == 0){
            return 0;
        }

        return n%2 + 10 * decimalToBinary(n/2);
    }

    //Finding the maximum number of an array
    public int findMaxNumber(int[]sampleArray, int n){
        if (n == 1){
            return sampleArray[0];
        }
        return Math.max(sampleArray[n - 1], findMaxNumber(sampleArray, n - 1));
    }

    //finding the sum and product of elements of an Array
    public String sumAndProduct(int[] sampleArray){

        int sum = 0; //-----------------------------------0(1)
        int product = 1; //-----------------------------------0(1)

        if (sampleArray.length == 1){ //-----------------------------------0(1)
            return " " + sampleArray[0]; //-----------------------------------0(1)
        }

        for (int i = 0; i < sampleArray.length; i++){ //-----------------------------------0(n)
            sum += sampleArray[i]; //-----------------------------------0(1)
            product *= sampleArray[i]; //-----------------------------------0(1)
        }
        //The time complexity is { o(1) + 0(1) + o(1) + 0(1) o(1) + 0(1) o(1) + 0(n) = O(n)}
        return "The sum of the elements in the Array is: " + sum + " while their product is: " + product;
    }

    //Method to print out the pairs of the lements of an array

    public void printPairs(int[]sampleAray){
        String s = ""; //-----------------------------------0(1)
        for (int i = 0; i < sampleAray.length; i++){ //-----------------------------------0(n)
            for (int j = 0; j < sampleAray.length ; j++){ //-----------------------------------0(n)
                System.out.println(s = "{" + sampleAray[i] + ", " + sampleAray[j] + "}"); //-----------------------------------0(1)

            }
        }
        //The time complexity is {O(1) + (O(n) * O(n)) + O(1)} = 2 (O(1)) + O(n^2) = O(n^2)
        // the time complexity is O(n^2)
    }

    //To reverse an Array
    public void reverse(int[] sampleArray){
        for (int i = 0; i < sampleArray.length/2; i++){ //------------O(n/2)
            int other = sampleArray.length-i-1; //------------O(1)
            int temp = sampleArray[i];   //------------O(1)
            sampleArray[i] = sampleArray[other];  //------------O(1)
            sampleArray[other] = temp;  //------------O(1)
        }
        System.out.println(Arrays.toString(sampleArray));  //------------O(1)
        //The time complexity is {O(1) + O(1) + O(1) + O(1) + O(1) + O(n/2) } = 5 (O(1)) + O(n/2) = (1/2)(O(n)) = O(n)

    }

    //To reverse an Array approach2
    public void reversArray(Integer []sampleArray){

        Collections.reverse(Arrays.asList(sampleArray));  //------------O(1)
        System.out.println("This is the collection: " + Arrays.asList(sampleArray));  //------------O(1)
        //Time complexity is ------------O(1)

    }

    //To reverse an Array approach2
    public void reversArray2(Integer []sampleArray) {
        int[] newArr = new int[sampleArray.length];
        for (int i = sampleArray.length - 1; i >= 0; i--) {//------------O(n)
            System.out.print(sampleArray[i] + " "); //------------O(1)
            newArr[1] = sampleArray[i];
        }

        //Time complexity is ------------O(n)
    }




        public static void main(String[] args) throws ParseException {
        Algorithm algo = new Algorithm();
        //System.out.println(algo.powerOfTwo(5));
        //System.out.println(algo.powerOfTwoIT(5));
        //System.out.println(algo.factorial(5));
        //algo.recursiveMethod(4);
        //System.out.println(algo.fibonacci(0));
        //System.out.println(algo.sumOfDigit(10));
        //System.out.println(algo.powerOfNumber(-2,6));
        //System.out.println(algo.decimalToBinary(10));
        //System.out.println(algo.findMaxNumber(new int []{11,4,12,7}, 4));
        //System.out.println(algo.sumAndProduct(new int[]{2,2,2}));
        //algo.printPairs(new int[]{1,3,4,5});
        //algo.reverse(new int[]{1,2,3,4,5});
        //algo.reversArray(new Integer[]{1,2,3,4,5});
        //algo.reversArray2(new Integer[]{5});


        //addMonth();
            String[] mons = new DateFormatSymbols(Locale.ENGLISH).getShortMonths();
            Calendar c = Calendar.getInstance();
//            int n = DateUtils.addDays(c.getTime(), -100).getMonth()+1;
//            System.out.println("NNN " + n);
//          System.out.println("C. GET TIME : " + c.getTime());
//       System.out.println("\n");
//        System.out.println("DATE UTILLS TODAY'S DATE= " + DateUtils.addDays(c.getTime(), -98));
//        int m = c.get(Calendar.MONTH);
//        System.out.println("MONTHS M " + m);
//        System.out.println("\n");

//        c.setTime(DateUtils.addDays(new Date(), 14));
//        System.out.println("14 DAYS= : " + c.getTime());
//        System.out.println("\n");
//
//        System.out.println("CALENDER.MONTH= " + c.get(Calendar.MONTH));
//        System.out.println("\n");
//
//        System.out.println("CALENDER.YEAR= " + c.get(Calendar.YEAR));
//        System.out.println("\n");
//
//        System.out.println("CALENDER.WEEK= " + c.get(Calendar.DAY_OF_WEEK));
//        System.out.println("\n");
//
//        c.setTime(DateUtils.addDays(new Date(), 7));
//        System.out.print("The system date and time is: " + c.getTime());

            System.out.println("@@@@ " + DateUtils.addDays(new Date(), 1));
            //System.out.println("@@@@ 2 " + DateUtils.addMonths(new Date(), -3));
//            long monthsBetween = ChronoUnit.MONTHS.between(
//                    YearMonth.from(LocalDate.parse(DateUtils.addDays(new Date(), 1))),
//                    YearMonth.from(LocalDate.parse("2016-11-30"))
//            );
//            System.out.println(getMonthForInt((int)monthsBetween));
            //System.out.println("##### " + getMonth("02 03 2021"));


            // creating calendar object
            //Calendar calendar = Calendar.getInstance();
            //calendar.add(Calendar.DATE, -15);
            //System.out.println("15 days ago: " + calendar.getTime());
            //calendar.add(Calendar.MONTH, -3);
            //int y = c.get(Calendar.MONTH);
            //int m = c.get(Calendar.MONTH);
            //System.out.println("@@@@ " + m);

            c.set(Calendar.DATE, c.getActualMinimum(Calendar.DATE));
            //System.out.println("$$$$$$$ " + c.getCalendarType());
            //int todaysDate = LocalDate.now().getDayOfMonth();
            //System.out.println("TODAYS DATE " + todaysDate);

            // System.out.println("MMMM " + y);
            //System.out.println("4 months later: " + c.getTime());
            //calendar.add(Calendar.YEAR, 2);
            //System.out.println("2 years later: " + calendar.getTime());

            //System.out.println("SPINWORD " + spinWord("programming"));
            System.out.println("SPINWORD :" + spinWord2("alternativemethod"));

            List elements = List.of("e1", "el2", "el3", "4 el", "5 el");
            list(elements);





        }

    private static String getMonth(String date) throws ParseException {
        Date d = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        String monthName = new SimpleDateFormat("MMMM").format(cal.getTime());
        return monthName;
    }


    public static void addMonth(){
        String[] months = new DateFormatSymbols(Locale.ENGLISH).getShortMonths();
        System.out.println("MONTHS " + Arrays.toString(months));
        List<String> monthList = new ArrayList<>(months.length);

        for (int i = 0; i < months.length; i++) {
            monthList.add(months[i]);
        }
        System.out.println(monthList);
    }

        static String getMonthForInt(int m) {
        String month = "invalid";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (m >= 0 && m <= 11 ) {
            month = months[m];
        }
        return month;
    }

//write an algorithm that takes in a word which is greater than 5 in charsb and then reverse it
    public static Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

    public static String spinWord(String sentence){
        String whiteSpace = " ";
        List<String> split = Arrays.asList(sentence.split(whiteSpace));
        System.out.println("SPLIT " + split);
        return split.stream().map(s -> {
            if (s.length() > 5){
                s = reverse.apply(s);
            }
            System.out.println("S " + s);
            return s;
        }).collect(Collectors.joining(whiteSpace));
    }

    //alternative and cleaner
    public static String spinWord2(String sentence){
        String whiteSpace = " ";
        return Arrays.stream(sentence.split(whiteSpace)).map(s -> s.length() > 5 ? reverse.apply(s) : s).collect(Collectors.joining(whiteSpace));
    }

    public static List<String> returnList(List<String> list){
        return list.stream().filter("1"::equalsIgnoreCase).findFirst().map(Collections::singletonList).orElse(list);
    }


    public static void list(List<String> elements){
        Map<String, List<String>> map = elements.stream().collect(
                Collectors.groupingBy(str -> str.startsWith("el") ?
                        "els" : "others"));

        map.entrySet().forEach(System.out::println);
    }

}
