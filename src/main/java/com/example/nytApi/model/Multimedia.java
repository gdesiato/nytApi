package com.example.nytApi.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Multimedia {

    private String type;
    private String subtype;
    private String caption;
    private String url;
    private int height;
    private int width;
}
