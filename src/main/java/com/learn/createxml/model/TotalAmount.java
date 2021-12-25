package com.learn.createxml.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "TotalAmount")
@XmlAccessorType(XmlAccessType.FIELD)
public class TotalAmount {

    @XmlAttribute(name = "CurrencyCode")
    private String currencyCode;

    @XmlElement(name = "Amount")
    private String Amount;
}
