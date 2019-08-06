package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class FragmentsController {

    @GetMapping("/fragments")
    public String getHome() {
        return "/fragments/fragments.html";
    }

    @GetMapping("/markup")
    public String markupPage() {
        return "/fragments/markup.html";
    }

    @GetMapping("/params")
    public String paramsPage() {
        return "/fragments/params.html";
    }

//    @GetMapping("/other")
//    public String otherPage(Model model) {
//        model.addAttribute("data", StudentUtils.buildStudents());
//        return "other.html";
//    }
}
