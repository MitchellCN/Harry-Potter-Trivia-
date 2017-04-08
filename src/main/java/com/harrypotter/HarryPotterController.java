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
    public String index(Model model){
        List<Question> q  = repository.listQuestion();
        List<String> answers = q.get(0).getAnswers().randomOrder();
        System.out.println(q.get(0).getQuestion());
        System.out.println(answers.get(0));
        model.addAttribute("questions",q);
        model.addAttribute("answers",answers);
        return "index";
    }

    @RequestMapping("/question")
    public String question(Integer question_id){
        System.out.println(question_id);

        return "redirect:/";
    }
}
