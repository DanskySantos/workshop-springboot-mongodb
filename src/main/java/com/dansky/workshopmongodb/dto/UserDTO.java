package com.dansky.workshopmongodb.dto;

import com.dansky.workshopmongodb.domain.User;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO(User user) {
        id = user.getId();
        name = user.getName();
        email = user.getEmail();
    }
}
