package webservicesandra.webservicesandra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservicesandra.webservicesandra.entity.Joke;

@RestController
@RequestMapping("")
public class JokeController {

    @GetMapping("/question")
    public String getQuestion() {
        return "In 1905, Einstein developed a theory about space..";
    }

    @GetMapping("/answer")
    public String getAnswer() {
        return "..it was about time too!";
    }

    @PostMapping("/joker")
    public String sendJoke(@RequestBody Joke joke) {
        return "Posted: " + joke;
    }
}
