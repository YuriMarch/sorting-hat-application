package com.letscode.sortinghat.payloads.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Value {
  @JsonProperty("name")
  String name;
}
