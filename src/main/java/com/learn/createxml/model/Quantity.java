package com.learn.createxml.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "Quantity")
@XmlAccessorType(XmlAccessType.FIELD)
public class Quantity {

    @XmlAttribute(name = "UnitCode")
    private String uom;

    @XmlValue
    private String quantity;

}
