package kr.daoko.ignite.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CountryDTO {
    private String code;
    private String name;
    private String continent;
    private String region;
    private int population;

    public CountryDTO(String key, Country value) {
        this.code = key;
        this.name = value.getName();
        this.continent = value.getContinent();
        this.region = value.getRegion();
        this.population = value.getPopulation();
    }
}
