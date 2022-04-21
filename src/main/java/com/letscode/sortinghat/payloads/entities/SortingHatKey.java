package com.letscode.sortinghat.payloads.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SortingHatKey {
  @JsonProperty("sorting-hat-key")
  private String sortingHatKey;
}
