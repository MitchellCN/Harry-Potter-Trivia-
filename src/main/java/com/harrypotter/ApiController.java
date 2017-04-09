package com.harrypotter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmitchell on 4/9/17.
 */
@RestController
public class ApiController {


    @GetMapping("/answer")
    public String getResponse(@RequestParam("questionId")String question, @RequestParam("response") String response){
        /*
        check s
         */
        return String.format("{question: %s, answer:%s}");
    }
}
/*
 $.post("/answer,
    {
       questionId: id,
       response: buttonTextcontent,
       }

 ");
 */
