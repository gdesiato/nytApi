package com.example.nytApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Doc {

    private Long id;
    @JsonProperty("web_url")
    private String webUrl;
    private List<Headline> headline;
    private List<Byline> byline;

    @JsonProperty("abstract")
    private String summary;

    private List<Multimedia> multimedia;
}
