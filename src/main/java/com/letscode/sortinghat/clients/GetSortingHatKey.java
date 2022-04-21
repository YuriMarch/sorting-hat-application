package com.letscode.sortinghat.clients;

import com.letscode.sortinghat.payloads.entities.SortingHatKey;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetSortingHatKey {
  public SortingHatKey execute() {
    String url = "https://api-harrypotter.herokuapp.com/sortinghat";

    RestTemplate restTemplate = new RestTemplate();

    return restTemplate.getForObject(url, SortingHatKey.class);
  }
}
