package com.letscode.sortinghat.payloads.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class House {

  @JsonProperty("id")
   String id;

  @JsonProperty("name")
   String name;

  @JsonProperty("animal")
  String animal;

  @JsonProperty("founder-name")
  String founderName;

  @JsonProperty("values")
  List<Value> values;
}
