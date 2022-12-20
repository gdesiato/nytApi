package com.example.nytApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Media {

    private String type;
    private String subtype;
    private String caption;
    private String url;
    @JsonProperty("media-metadata")
    private List<Thumbnail> mediaMetadata;
}