package webservicesandra.webservicesandra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webservicesandra.webservicesandra.model.Joke;
import webservicesandra.webservicesandra.repository.JokeRepository;

import java.util.List;


@RestController
@RequestMapping("/jokes")
public class JokeController {

    private final JokeRepository jokeRepository;

    public JokeController(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @GetMapping("/question")
    public String getQuestion() {
        return "In 1905, Einstein developed a theory about space..";
    }

    @GetMapping("/answer")
    public String getAnswer() {
        return "..it was about time too!";
    }

    @PostMapping("")
    public ResponseEntity<Joke> addJoke(@RequestBody Joke joke) {
        Joke respJoke = jokeRepository.save(joke);
        return ResponseEntity.status(201).body(respJoke);
    }

    @GetMapping("/")
    public ResponseEntity<List<Joke>> allJokes() {
        return ResponseEntity.ok(jokeRepository.findAll());
    }
}
