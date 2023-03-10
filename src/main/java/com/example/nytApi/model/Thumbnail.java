package com.example.nytApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Thumbnail {

    @JsonProperty("url")
    private String url;
    @JsonProperty("height")
    int height;
    @JsonProperty("width")
    int width;
}