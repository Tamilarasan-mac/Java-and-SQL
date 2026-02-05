package com.example.datetime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DateTimeController {

    // 1️⃣ Load frontend page
    @GetMapping("/")
    public String home() {
        return "index"; // index.html
    }

    // 2️⃣ API for date & time
    @GetMapping("/api/datetime")
    @ResponseBody
    public String getDateTime(@RequestParam String timezone) {

        ZonedDateTime time =
                ZonedDateTime.now(ZoneId.of(timezone));

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        return time.format(formatter);
    }
}