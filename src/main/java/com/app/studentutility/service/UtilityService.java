package com.app.studentutility.service;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    public String arithmeticOperation(String operation, int a, int b){
        return switch (operation) {
            case "add" -> addTwoNumbers(a, b);

            case "subtract" -> subtractFromNumber(a, b);

            case "multiply" -> multiplyTwoNumbers(a, b);

            case "divide" -> divide(a, b);

            default -> "Unknown operation: " + operation;
        };
    }

    public String addTwoNumbers(int first, int second) {
        int sum = first + second;
        return "Sum of " + first + " + " + second + " = " + sum;
    }

    public String subtractFromNumber(int number, int minus){
        int result = number - minus;
        return number + " - " + minus + " = " + result;
    }

    public String multiplyTwoNumbers(int first, int second){
        int result = first * second;
        return  first + " X " + second + " = " + result;
    }

    public String divide(int number, int divideBy){
        if(divideBy == 0)
            return "Please enter a positive number";

        double result = (double) number / divideBy;
        return number + "/" + divideBy + " = " + result;
    }


    public String evenOrOdd(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd";
        return num + " is an " + result + " number";
    }

    public String printTo(int num) {
        if (num <= 0) return "Please enter a positive number.";
        if (num > 1000) return "Please enter a number ≤ 1000.";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            if (i < num) sb.append(", ");
        }
        return "Numbers from 1 to " + num + ":\n" + sb;
    }

    public String dayOfWeek(int num) {
        return switch (num) {
            case 1 -> "Day 1 of the week is → SUNDAY";
            case 2 -> "Day 2 of the week is → MONDAY";
            case 3 -> "Day 3 of the week is → TUESDAY";
            case 4 -> "Day 4 of the week is → WEDNESDAY";
            case 5 -> "Day 5 of the week is → THURSDAY";
            case 6 -> "Day 6 of the week is → FRIDAY";
            case 7 -> "Day 7 of the week is → SATURDAY";
            default -> "Invalid day. Please enter a number between 1 and 7.";
        };
    }
}
