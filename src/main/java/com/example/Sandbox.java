package com.example;

import com.example.domain.model.Land;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Sandbox {

    @GetMapping("search")
    Land search() throws Exception {
        Search search =  new Search.Builder("{\n" +
                "  \"query\": { \"match\": { \"base_id\": 24 } }\n" +
                "}")
                .addIndex("base")
                .build();

        SearchResult searchResult = client.execute(search);

        Land land = objectMapper.readValue(searchResult.getSourceAsString(), Land.class);
        return land;
    }

    JestClient client;
    ObjectMapper objectMapper;

    Sandbox(JestClient client, ObjectMapper objectMapper) {
        this.client = client;
        this.objectMapper = objectMapper;
    }
}