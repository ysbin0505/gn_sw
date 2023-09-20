package com.example.demo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ScheduleControllerBeta {

    @GetMapping("/setting")
    public String settingDay() {
        return "settingDayBeta";
    }

    @PostMapping("/schedule")
    public String makeSchedule(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate, Model model) {
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);
        return "makeScheduleBeta";
    }
}
