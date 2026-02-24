package com.app.studentutility.controller;

import com.app.studentutility.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class UtilityController {

    @Autowired
    private UtilityService utilityService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/api/arithmetic")
    @ResponseBody
    public Map<String, String> arithmeticOperation(@RequestParam String operation, @RequestParam int a, @RequestParam int b) {
        return Map.of("result", utilityService.arithmeticOperation(operation, a, b));
    }

    @PostMapping("/api/evenodd")
    @ResponseBody
    public Map<String, String> evenOrOdd(@RequestParam int num) {
        return Map.of("result", utilityService.evenOrOdd(num));
    }

    @PostMapping("/api/printto")
    @ResponseBody
    public Map<String, String> printTo(@RequestParam int num) {
        return Map.of("result", utilityService.printTo(num));
    }

    @PostMapping("/api/dayofweek")
    @ResponseBody
    public Map<String, String> dayOfWeek(@RequestParam int num) {
        return Map.of("result", utilityService.dayOfWeek(num));
    }
}
