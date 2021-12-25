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
@AllArgsConstructor
@XmlRootElement(name = "PurchaseOrderHeader")
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrderHeader {

    @XmlElement(name = "Type")
    private String type;

    @XmlElement(name = "TotalAmount")
    private String totalAmount;

    @XmlElement(name = "CustomerParty")
    private CustomerParty customerParty;

    @XmlElement(name = "SupplierParty")
    private SupplierParty supplierParty;

    @XmlElement(name = "RemitToParty")
    private RemitToParty remitToParty;

}
