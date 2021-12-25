package com.learn.createxml.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement(name = "Fruit")
@XmlAccessorType(XmlAccessType.FIELD)
public class Fruit {

    @XmlAttribute(name = "Id")
    private int id;

    @XmlElement(name="Name")
    private String name;

    @XmlElement(name="Price")
    private String price;
}
