package kr.daoko.ignite.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Country {
    private String name;
    private String continent;
    private String region;
    private int population;
    private BigDecimal surfaceArea;
    private short indepYear;
    private BigDecimal lifeExpectancy;
    private BigDecimal gnp;
    private BigDecimal gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private int capital;
    private String code2;
}
