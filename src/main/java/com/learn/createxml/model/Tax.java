package com.learn.createxml.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "Tax")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tax {

    @XmlAttribute(name = "CurrencyId")
    private String currencyCode;

    @XmlElement(name = "Amount")
    private String amount;
}
