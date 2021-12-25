package com.learn.createxml.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "PurchaseOrder")
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseOrder {

    @XmlElement(name = "PurchaseOrderHeader")
    private PurchaseOrderHeader purchaseOrderHeader;

    @XmlElement(name="PurchaseOrderLine")
    private List<PurchaseOrderLine> purchaseOrderLine;
}
