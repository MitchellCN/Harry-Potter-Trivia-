package com.harrypotter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cmitchell on 4/8/17.
 */

@Controller
public class HarryPotterController {

    @Autowired
    QuestionRepository repository;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/question")
    public String question(Model model) {
//        System.out.println(question_id);
        List<Question> q  = repository.listQuestion();

        model.addAttribute("questions",q);
        return "questions";
    }

    @RequestMapping("/question/{id}")
    public String question(Model model, Integer id) {
        System.out.println(id);
        List<Question> q  = repository.listQuestion();

        model.addAttribute("questions",q);
        return "redirect: /question";
    }

    @RequestMapping("/end")
    public String end(){
        return "end";
    }
}
