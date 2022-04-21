package com.letscode.sortinghat.clients;

import com.letscode.sortinghat.payloads.entities.House;
import org.springframework.http.*;
import  org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetHouse {

  public House execute(String houseKey) {
    String url = "https://api-harrypotter.herokuapp.com/house/{houseKey}";

    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

    HttpEntity<?> entity = new HttpEntity<>(headers);
    ResponseEntity<House> houseResponseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, House.class, houseKey);

    if (houseResponseEntity.getStatusCode().isError()) {
      return null;
    }

    return houseResponseEntity.getBody();
  }
}
