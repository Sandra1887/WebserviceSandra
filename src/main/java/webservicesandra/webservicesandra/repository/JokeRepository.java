package webservicesandra.webservicesandra.repository;

import org.springframework.stereotype.Repository;
import webservicesandra.webservicesandra.model.Joke;

@Repository
public interface JokeRepository extends org.springframework.data.mongodb.repository.MongoRepository<Joke, String> {
}
