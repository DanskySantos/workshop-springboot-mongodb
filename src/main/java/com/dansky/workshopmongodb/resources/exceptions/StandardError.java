package com.dansky.workshopmongodb.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer Status;
    private String error;
    private String message;
    private String path;

}
