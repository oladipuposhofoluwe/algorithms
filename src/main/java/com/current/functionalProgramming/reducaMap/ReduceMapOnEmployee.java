package com.algorithm.functionalProgramming.reducaMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReduceMapOnEmployee {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDatabase.getAllEmployees();

        //to get employee whose grade is A
        //then get the salary
        double averageSalary = employees.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();

        System.out.println(averageSalary);

        //to find the sum of the employees whose grade is A
        //with sum() function
        double totalSalary = employees.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .mapToDouble(i -> (int) i.getSalary())
                .sum();
        System.out.println(totalSalary);

        //another option... with reduce() function
        double totalSalary2 = employees.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .mapToDouble(i -> (int) i.getSalary())
                .reduce((employee1, employee2) -> employee1 + employee2).getAsDouble();
        System.out.println(totalSalary2);

//        String generateString1 = RandomStringUtils.randomAlphanumeric(32);
//        String generateString2 = RandomStringUtils.random(10);
//        String generateString3 = RandomStringUtils.randomAlphabetic(10);
//        String generateString4 = RandomStringUtils.randomAscii(10);
//        String generateString5 = RandomStringUtils.randomNumeric(4);
//        System.out.println("STRING GENERATION 1: " + generateString1);
//        System.out.println("STRING GENERATION 2: " + generateString2);
//        System.out.println("STRING GENERATION 3: " + generateString3);
//        System.out.println("STRING GENERATION 4: " + generateString4);
//        System.out.println("STRING GENERATION 5: " + generateString5);

        Calendar calendar = GregorianCalendar.getInstance();
        //calendar.setTimeInMillis(System.currentTimeMillis());
        //System.out.println("date1 " + calendar.getTime());
//
//        System.out.println("The YEAR is: " + calendar.get(Calendar.YEAR));
//        System.out.println("The MONTH is: " + calendar.get(Calendar.MONTH));
//        System.out.println("The DAY is: " + calendar.get(Calendar.DATE));
//        System.out.println("The HOUR is: " + calendar.get(Calendar.HOUR));
//        System.out.println("The MINUTE is: " + calendar.get(Calendar.MINUTE));
//        System.out.println("The SECOND is: " + calendar.get(Calendar.SECOND));
//        System.out.println("The AM_PM indicator is: " + calendar.get(Calendar.AM_PM));

        Date aDate = new Date();
        DateFormat dateFormatter = DateFormat.getDateTimeInstance();
        String formattedDate1 = dateFormatter.format(aDate);
        System.out.println("The formattedDate1 is: " + formattedDate1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY/MM/dd");
        String formattedDate2 = simpleDateFormat.format(aDate);
        System.out.println("The formattedDate2 is: " + formattedDate2);

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String formattedDate3 = dateFormatSymbols.getLocalPatternChars();
        System.out.println("The formattedDate3 is: " + formattedDate3);

        Calendar calendar1 = GregorianCalendar.getInstance();
        calendar1.setTime(new Date());
        calendar1.set(Calendar.YEAR, 1988);
        calendar1.set(Calendar.MONTH, 11);
        calendar1.set(Calendar.DAY_OF_MONTH, 17);
        System.out.println("DDDDD " + calendar1.getTime());

        Calendar c = Calendar.getInstance();

//        Date startDateRange = null;
//        Date endDateRange = null;

        c.set(Calendar.DATE, c.getActualMinimum(Calendar.DATE));
        c.set(4,7);
        System.out.println("CCC2 c " + c.getTime() );
//        Date firstDateOfCurrMnth=c.getTime();
//        Date lastDateOfPrevious= DateUtils.addDays(firstDateOfCurrMnth,-1);
//        //first date of last 3rd month is startdate range
//        startDateRange=DateUtils.addMonths(lastDateOfPrevious,-3);
//        //end date of prev month is end date range
//        endDateRange=lastDateOfPrevious;
//
//        System.out.println("firstDateOfCurrMnth: " + firstDateOfCurrMnth);
//        System.out.println("lastDateOfPrevious: " + lastDateOfPrevious);
//        System.out.println("START DATE: " + startDateRange);
//        System.out.println("END DATE: " + endDateRange);

        System.out.println(isValidPassword("arsenal4life#"));
    }

    private static boolean isValidPassword(String password) {
        String regex = "^(([0-9]|[a-z]|[A-Z]|[@.&*!#$%^():;'?><])*){8,40}$";

        Pattern p = Pattern.compile(regex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
        System.out.println("MMMM " + m);
        return m.matches();
    }

}
