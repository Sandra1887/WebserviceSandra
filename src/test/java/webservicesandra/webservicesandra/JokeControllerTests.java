package webservicesandra.webservicesandra;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import webservicesandra.webservicesandra.controllers.JokeController;
import webservicesandra.webservicesandra.model.Joke;
import webservicesandra.webservicesandra.repository.JokeRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JokeControllerTests {

    @Mock
    private JokeRepository jokeRepository;

    @InjectMocks
    private JokeController jokeController;

    @Test
    public void testAllJokes() {
        // Create a list of jokes for testing
        List<Joke> jokeList = new ArrayList<>();
        jokeList.add(new Joke("1", "Knock knock"));
        jokeList.add(new Joke("2", "Who's there?"));

        when(jokeRepository.findAll()).thenReturn(jokeList);

        ResponseEntity<List<Joke>> responseEntity = jokeController.allJokes();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        assertEquals(jokeList, responseEntity.getBody());
    }
}