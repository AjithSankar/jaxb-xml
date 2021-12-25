package com.learn.createxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XmlRootElement(name = "ProcessPurchaseOrder")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProcessPurchaseOrder {

    @XmlElement(name = "DataArea")
    private DataArea dataArea;
}
