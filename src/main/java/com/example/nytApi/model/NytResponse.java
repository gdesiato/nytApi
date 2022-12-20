package com.example.nytApi.model;

import com.example.nytApi.model.Article;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class NytResponse {

    private String status;
    private String copyright;
    @JsonProperty("num_results")
    private int numResults;
    private List<Article> results;
}
