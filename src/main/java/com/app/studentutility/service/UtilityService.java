package com.app.studentutility.service;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

    public String addTwoNumbers(int first, int second) {
        int sum = first + second;
        return "Sum of " + first + " + " + second + " = " + sum;
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
            case 1 -> "Day 1 → MONDAY";
            case 2 -> "Day 2 → TUESDAY";
            case 3 -> "Day 3 → WEDNESDAY";
            case 4 -> "Day 4 → THURSDAY";
            case 5 -> "Day 5 → FRIDAY";
            case 6 -> "Day 6 → SATURDAY";
            case 7 -> "Day 7 → SUNDAY";
            default -> "Invalid day. Please enter a number between 1 and 7.";
        };
    }
}
