package com.vit.result.controller;

import com.vit.result.entity.StudentResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//C:\Users\Admin\Desktop\vit-result-system\result\src\main\java\com\vit\result\repository
                                                                                            
@Controller
public class ResultController {

    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("student", new StudentResult());
        return "index";
    }

    @PostMapping("/result")
    public String calculateResult(
            @ModelAttribute StudentResult student,
            Model model) {

        int total1 = student.getMse1() + student.getEse1();
        int total2 = student.getMse2() + student.getEse2();
        int total3 = student.getMse3() + student.getEse3();
        int total4 = student.getMse4() + student.getEse4();

        int grandTotal = total1 + total2 + total3 + total4;

        double percentage = grandTotal / 4.0;

        String grade;

        if (percentage >= 75) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "FAIL";
        }

        model.addAttribute("student", student);
        model.addAttribute("total1", total1);
        model.addAttribute("total2", total2);
        model.addAttribute("total3", total3);
        model.addAttribute("total4", total4);
        model.addAttribute("grandTotal", grandTotal);
        model.addAttribute("percentage", percentage);
        model.addAttribute("grade", grade);

        return "result";
    }
}