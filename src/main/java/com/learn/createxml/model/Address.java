package com.learn.createxml.model;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "Address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    @XmlAttribute(name = "SchemeName")
    private String id;

    @XmlElement(name = "AddressLine1")
    private String addressLine1;

    @XmlElement(name = "AddressLine2")
    private String addressLine2;

    @XmlElement(name = "CityName")
    private String cityName;

    @XmlElement(name = "CountryCode")
    private String countryCode;

    @XmlElement(name = "PostalCode")
    private String postalCode;
}
