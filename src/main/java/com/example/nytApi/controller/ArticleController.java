package com.example.nytApi.controller;

import com.example.nytApi.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("articleList", articleService.getMostPopular());
        return "index";
    }

    // display the search page.
    @GetMapping("/search")
    public String displaySearchPage(){
        return "search";
    }

    // receive a search text input and calls the service method for results.
    // It will then add those results to the model and return a template to display them.
    // @RequestParam enables spring to extract input data that may be passed as a query,
    // form data, or any arbitrary custom data.
    @PostMapping("/search")
    public String postToSearchPage(@RequestParam String searchText, Model model){
        model.addAttribute(articleService.getSearchResults(searchText));
    return "search_results";
    }
}