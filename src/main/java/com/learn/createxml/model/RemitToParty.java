package com.learn.createxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "RemitToParty")
@XmlAccessorType(XmlAccessType.FIELD)
public class RemitToParty {

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Address")
    private Address remitToAddress;

    @XmlElement(name = "Contact")
    private String contact;
}
