package com.findbestdeal.frontend.games.domian;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
//    private String gogPrice;
//    private String steamPrice;

    @JsonIgnore
    private Map<String, Long> additionalProperties = new HashMap<String, Long>();

    @JsonAnyGetter
    public Map<String, Long> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Long value) {
        this.additionalProperties.put(name, value);
    }
}
