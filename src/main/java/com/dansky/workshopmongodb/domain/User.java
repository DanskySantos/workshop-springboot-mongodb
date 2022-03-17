package com.dansky.workshopmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

@Document(collection = "user")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;


}
