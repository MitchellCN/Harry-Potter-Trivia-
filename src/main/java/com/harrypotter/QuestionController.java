package com.harrypotter;

import com.harrypotter.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gavin on 4/7/17.
 */
@Controller
public class QuestionController {
    @Autowired
    QuestionRepository repo;
    @RequestMapping("/")
    public String listQuestion(Model model) {
        model.addAttribute("question", repo.listQuestion());
        return "questions";
    }
}

