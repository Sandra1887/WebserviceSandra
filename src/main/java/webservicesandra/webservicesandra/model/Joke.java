package webservicesandra.webservicesandra.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Joke {

    @MongoId
    private String id;
    private String joke;
}
