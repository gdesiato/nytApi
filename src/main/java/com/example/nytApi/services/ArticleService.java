package com.example.nytApi.services;

import com.example.nytApi.model.Article;
import com.example.nytApi.model.NytResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Value("${api_key}")
    private String apikey;

    @Value("${mostPopularUrl}")
    private String mostPopularUrl;

    @Autowired
    RestTemplate restTemplate;

    public List<Article> getMostPopular() {
        NytResponse response = restTemplate.getForObject(mostPopularUrl + "api-key=" + apikey, NytResponse.class);
        List<Article> results = new ArrayList<>();
        if (response != null && response.getStatus().equals("OK")) {
            //loop through articles - and if there is media - and if there is mediametadata (.size-1 to get the last one)
            //multiply height and width and take the result
            for (Article article : results){
                if (results != null){
                    for (Article media : results){
                    }
                }

            }
            return response.getResults();
        } else {
            return results;
        }
    }
}