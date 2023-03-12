package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.DateFormat;
import java.util.Date;

@Controller
public class MainController {

    private DateFormat dateFormat;
    @GetMapping("/greeting") //http://localhost:8080/greeting
    public String greeting(@RequestParam(required = false, defaultValue = "World") String name, Model model) {
        Date date = new Date();
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        model.addAttribute("name", name);
        model.addAttribute("date", dateFormat.format(date));
        return "greeting";
    }
}
