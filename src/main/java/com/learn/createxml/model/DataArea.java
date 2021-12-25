package com.learn.createxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "DataArea")
@XmlAccessorType(XmlAccessType.FIELD)
public class DataArea {

    @XmlElement(name = "PurchaseOrder")
    private PurchaseOrder purchaseOrder;
}
