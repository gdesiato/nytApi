package com.example.nytApi.services;

import com.example.nytApi.model.Article;
import com.example.nytApi.model.Doc;
import com.example.nytApi.model.NytResponse;
import com.example.nytApi.model.NytSearchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    // @Value will look in our application.property file for this specific property
    // if it will find the property, it will assign it to this value
    @Value("${api_key}")
    private String apikey;

    @Value("${mostPopularUrl}")
    private String mostPopularUrl;

    @Value("${articleSearchUrl}")
    private String articleSearchUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<Article> getMostPopular() {
        NytResponse response = restTemplate.getForObject(mostPopularUrl + "api-key=" + apikey, NytResponse.class);
        List<Article> results = new ArrayList<>();
        if (response != null && response.getStatus().equals("OK")) {
            //loop through articles - and if there is media - and if there is mediametadata (.size-1 to get the last one)
            //multiply height and width and take the result
            for (Article article : response.getResults()) {
                    article.setImageUrl(article.getMedia().get(0).getMediaMetadata().
                            get(article.getMedia().get(0).getMediaMetadata().size()-1)
                            .getUrl());
                results.add(article);
            }
            return results;
        } else {
            return results;
        }
    }

    public List<Doc> getSearchResults(String searchText){
        ResponseEntity<NytSearchResponse> response = restTemplate
                .getForEntity(articleSearchUrl + searchText + "api-key=" + apikey, NytSearchResponse.class);
        List<Doc> results = new ArrayList<>();
        if (response != null && response.getStatusCode().equals("OK")) {

        return null;
    }
}