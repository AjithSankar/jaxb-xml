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
@XmlRootElement(name = "SupplierParty")
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplierParty {

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Address")
    private Address shipToAddress;

    @XmlElement(name = "Contact")
    private String contact;
}
